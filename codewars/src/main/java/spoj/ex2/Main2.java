package spoj.ex2;

import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int start;
        int finish;
        i = in.nextInt();
        for (int j = 0; j < i; j++){
            start = in.nextInt();
            finish = in.nextInt();
            for (int m = start; m <= finish; m++){
                if (isPrime(m)){
                    System.out.println(m);
                }
            }
            System.out.println();
        }
    }

    static public boolean isPrime(int number){
        int count = 0;
        for (int i = 2; i <= number; i++){
            if (number % i == 0){
                count++;
            }
        }
        return count == 1 ? true : false;
    }
}
