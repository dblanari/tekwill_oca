package spoj.ex1;

import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i;
        while(in.hasNext() && (i = in.nextInt()) != 42) {
            System.out.println(i);
        }
    }
}