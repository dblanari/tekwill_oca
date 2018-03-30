package spoj.ex2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int min = scanner.nextInt();
            int max = scanner.nextInt();
            for (int j = min; j <= max; j++) {
                if (isPrime(j)) {
                    System.out.println(j);
                }
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        int inpar = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                inpar++;
            }
            if (inpar > 1) {
                break;
            }
        }
        return num > 1 && inpar == 1;
    }
}
