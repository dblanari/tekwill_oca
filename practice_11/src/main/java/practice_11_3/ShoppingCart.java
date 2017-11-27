/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_11_3;

public class ShoppingCart {
    public static void main(String args[]){
        Order order = new Order("Rick Wilson", 910.00, "VA", Order.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}    
