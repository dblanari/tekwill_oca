package practice_08_3;

/**
 * Created by dblanari on 11/15/17.
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println(sum (1, 2));
        System.out.println(sum (1.0F, 2.0F));
        System.out.println(sum (1, 2.0F));
    }

    static int sum(int num1, int num2) {
        System.out.println("Method One");
        return num1 + num2;
    }

    static float sum(float num1, float num2) {
        System.out.println("Method Two");
        return num1 + num2;
    }


    static float sum(int num1, float num2) {
        System.out.println("Method Three");
        return num1 + num2;
    }
}
