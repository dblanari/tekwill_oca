package spoj.ex2;

import java.util.Scanner;

class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int min= scanner.nextInt();
            int max = scanner.nextInt();

            for (int j = min; j <= max ; j++) {
                int count = 0;
                for (int k =2; k<=j; k++) {
                    if (j % k ==  0) {
                        count++;
                    }
                }
                if (count == 1) {
                    System.out.println(j);
                }
            }
            System.out.println();
        }
    }
}
