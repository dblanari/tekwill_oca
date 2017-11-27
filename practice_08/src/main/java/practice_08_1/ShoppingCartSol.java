/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_08_1;

public class ShoppingCartSol {
    public static void main (String[] args){
        ItemSol item1 = new ItemSol();
        
        // Call the setColor method on item1. 
        // Print an appropriate message, depending upon the return value.
        if (item1.setColor('B')){
            System.out.println("Item1.color = " +item1.color);
        }
        else System.out.println("Invalid color");
    }
}    
