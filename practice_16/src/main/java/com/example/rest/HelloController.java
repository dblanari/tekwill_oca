/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
public class HelloController {

    // Hello
    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "Hello";
    }

}
