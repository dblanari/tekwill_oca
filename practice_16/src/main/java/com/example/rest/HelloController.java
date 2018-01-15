/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    // Hello
    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "Hello2";
    }

}
