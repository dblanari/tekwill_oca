/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_08_2_sol;

/**
 *
 */
public class Item {
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " +desc +", " +quantity +", " +price +", " +colorCode);
    }
    
    // Write a public 3-arg setItemFields method that returns void.
    public void setItemFields(String desc, int qty, double pr) {
        this.desc = desc;
        this.quantity = qty;
        this.price = pr;
    }

    /**
     *
     * @param desc
     * @param qty
     * @param pr
     * @param c
     * @return
     */
    public int setItemFields(String desc, int qty, double pr, char c) {
        if (c != ' ') {
            colorCode = c;
            this.setItemFields(desc, qty, pr);
            return 1;
        } 
        else{
            return -1;
        }
    }
}


