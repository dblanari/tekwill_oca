/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */
package com.example.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

//@SpringBootApplication
//public class Application {
//
//    public static final Properties myProps = new Properties();
//
//    public static void main(String[] args) {
//        // Set properties
//
//        myProps.setProperty("server.address", "0.0.0.0");
//        myProps.setProperty("server.port", "8080");
//
//        SpringApplication app = new SpringApplication(Application.class);
//        app.setDefaultProperties(myProps);
//        app.run(args);
//
//    }
//}


@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}