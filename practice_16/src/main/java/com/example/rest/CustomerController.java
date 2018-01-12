/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CopyOnWriteArrayList<Customer> cList = MockCustomerList.getInstance();

    // Get all customers
    @RequestMapping(method = RequestMethod.GET)
    public Customer[] getAll() {
        return cList.toArray(new Customer[0]);
    }

    // Get all customers under 20 years
    @RequestMapping(value = "/under20", method = RequestMethod.GET)
    public Customer[] getAllUnder20Years() {
        return cList
                .stream()
                .filter(s -> (2018 - Integer.parseInt(s.getBirthday().substring(0, 4)) < 20))
                .collect(Collectors.toList())
                .toArray(new Customer[0]);
    }

    // Get a customer
    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Customer get(@PathVariable long id) {

        Customer match = null;

        for (Customer c : cList) {
            if (c.getId() == id) {
                match = c;
            }
        }

        if (match != null) {
            return match;
        } else {
            throw new NotFoundException(id + " not found");
        }

    }

    // Add a Customer
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity add(@RequestBody Customer customer) {
        cList.add(customer);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }


    // Update a Customer
    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public ResponseEntity update(@PathVariable long id, @RequestBody Customer customer) {

        int matchIndex = -1;

        for (Customer c : cList) {
            if (c.getId() == id) {
                matchIndex = cList.indexOf(c);
            }
        }

        if (matchIndex > -1) {
            cList.set(matchIndex, customer);
            return new ResponseEntity<>(null, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }


    // Delete a Customer
    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public ResponseEntity delete(@PathVariable long id) {

        int matchIndex = -1;

        for (Customer c : cList) {
            if (c.getId() == id) {
                matchIndex = cList.indexOf(c);
            }
        }

        if (matchIndex > -1) {
            cList.remove(matchIndex);
            return new ResponseEntity<>(null, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }


    // Throw this exception when a lookup fails
    @ExceptionHandler(NotFoundException.class)
    @ResponseBody
    public ResponseEntity<?> myError(Exception exception) {
        return new ResponseEntity<>(new JsonError("ID not found error:", exception.getMessage()), HttpStatus.NOT_FOUND);
    }


}
