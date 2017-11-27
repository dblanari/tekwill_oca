/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_08_1;

public class ItemSol {
    char color;
        
    // Declare and code the setColor method.
    public boolean setColor(char colorCode){
        if (colorCode == ' '){
            return false;
        }
        else {
            this.color = colorCode;
            return true;
        }   
    }
}

