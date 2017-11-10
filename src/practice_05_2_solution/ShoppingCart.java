/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_05_2_solution;

public class ShoppingCart {
    public static void main(String[] args){
        String custName = "Mary Smith";
        String message;
 
        // Declare and initialize the items String array with 4 item descriptions.
        String[] items = {"Shirt", "Socks", "Scarf", "Belt"};
        
        // Change message to show the number of items purchased.
        message = custName +" wants to purchase " +items.length +" items.";
        System.out.println(message);
        
        // Print an element from the items array.
        System.out.println(items[2]);
        //System.out.println(items[4]);
    }
}
