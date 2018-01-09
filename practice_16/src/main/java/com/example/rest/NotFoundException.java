/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.example.rest;

public class NotFoundException extends RuntimeException {

    /*
     * Create a HTTP 404 (Not Found) exception.
     */
    public NotFoundException(String message) {
        super(message);
    }
}
