package spoj.ex1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (scanner.hasNext() && (num = scanner.nextInt()) != 42) {
            System.out.println(num);
        }
    }
}
