package spoj.ex1;

import java.util.Scanner;

class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int y;
        while (scanner.hasNext()) {
            y = scanner.nextInt();
            if (y == 42)
                break;
            System.out.println(y);
        }
    }
}
