/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */
package com.example.rest;

import java.util.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static final Properties myProps = new Properties();

    public static void main(String[] args) {
        // Set properties

        myProps.setProperty("server.address", "localhost");
        myProps.setProperty("server.port", "8080");

        SpringApplication app = new SpringApplication(Application.class);
        app.setDefaultProperties(myProps);
        app.run(args);

    }
}
