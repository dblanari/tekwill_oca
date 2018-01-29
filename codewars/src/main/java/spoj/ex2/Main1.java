package spoj.ex2;

import java.util.Scanner;

class Main1 {
    static public boolean isPrime(int number) {
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count == 1 ? true : false;
    }

    public static void main(String[] args) {
        //System.out.println("Numarul de iteratii: ");
        Scanner scanam = new Scanner(System.in);

        int max = scanam.nextInt();
       // System.out.println("Numerele pentru sortare: ");
        for (int i = 0; i <= max; i++) {

            int start = scanam.nextInt();
            int finish = scanam.nextInt();



          //  System.out.println("Numerele PRIME !");
            for (int n = start; n < finish; n++) {


                if (isPrime(n)) {
                    System.out.println(n);

                }


            }

        }

    }
}
