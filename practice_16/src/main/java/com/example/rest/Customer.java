/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.example.rest;

public class Customer {
  private final long id;
  private final String firstName;
  private final String lastName;
  private final String email;
  private final String city;
  private final String state;
  private final String birthday;
  
  public Customer(){
      super();
      id = 0;
      firstName = "";
      lastName = "";
      email = "";
      city = "";
      state = "";
      birthday = "";
  }
   
  public Customer(long id, String firstName, String lastName, String email, String city, String state, String birthday){
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.city = city;
      this.state = state;
      this.birthday = birthday;
  }
  
  public long getId(){
    return this.id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }
  
  public String getEmail(){
    return this.email;
  }

  public String getCity() {
    return this.city;
  }

  public String getState() {
    return this.state;
  } 
  
  public String getBirthday(){
    return this.birthday;
  }
  
  @Override
  public String toString(){
    return "ID: " + id 
        + " First: " + firstName
        + " Last: " + lastName + "\n"
        + "EMail: " + email + "\n"
        + "City: " + city
        + " State: " + state
        + " Birthday " + birthday;
  }  
  
}
