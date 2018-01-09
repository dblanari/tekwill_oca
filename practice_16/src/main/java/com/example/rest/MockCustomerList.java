/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.example.rest;

import java.util.concurrent.CopyOnWriteArrayList;

public class MockCustomerList {
  private static final CopyOnWriteArrayList<Customer> cList = new CopyOnWriteArrayList<>();

  static {
    // Create list of customers
    cList.add(
        new Customer(100, "George", "Washington", "gwash@example.com", "Mt Vernon", "VA", "1732-02-23")
    );

    cList.add(
        new Customer(101, "John", "Adams", "jadams@example.com", "Braintree", "MA", "1735-10-30")
    );

    cList.add(
        new Customer(102, "Thomas", "Jefferson", "tjeff@example.com", "CharlottesVille", "VA", "1743-04-13")
    );

    cList.add(
        new Customer(103, "James", "Madison", "jmad@example.com", "Orange", "VA", "1751-03-16")
    );

    cList.add(
        new Customer(104, "James", "Monroe", "jmo@example.com", "New York", "NY", "1758-04-28")
    );

  }
  
  private MockCustomerList(){}
  
  public static CopyOnWriteArrayList<Customer> getInstance(){
    return cList;
  }
  
}
