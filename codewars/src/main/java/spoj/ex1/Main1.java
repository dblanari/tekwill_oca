package spoj.ex1;

import java.util.Scanner;

class Main1 {
    public static void main(String[] args) {
        System.out.print("Enter something:");
        Scanner scanam = new Scanner(System.in);
        int i;
        while (scanam.hasNext() && (i = scanam.nextInt()) !=42){
            System.out.println(i);
        }

        }
}
