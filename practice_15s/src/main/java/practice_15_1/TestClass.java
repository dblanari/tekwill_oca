/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_15_1;

public class TestClass {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: "+addResult);
        
        // Handle possible ArithmeticException
        try {           
            double divResult = calc.divide(15, 0);
            System.out.println("Division Result: "+divResult);
        }
        catch (ArithmeticException ae){
            System.out.println(ae);
        }        
    }
}