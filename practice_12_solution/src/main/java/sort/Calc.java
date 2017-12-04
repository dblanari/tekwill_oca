package sort;

/**
 * exemplu: java Calc sum  0.5 3.5 2.4
 * exemplu: java Calc media 0.5 3.5 2.4
 * exemplu: java Calc produs 0.5 3.5 2.4
 * javac practice_12_solution/src/main/java/sort/Calc.java
 * cd practice_12_solution/src/main/java
 * java sort/Calc sum 3.4 5.6
 * java sort/Calc media 7.0 8.0 9.0
 * java sort/Calc produs 7.0 8.0 10.0
 */
public class Calc {
    public static void main(String[] args) {
        double result = 0;
        if (args.length > 0) {
            switch (args[0]) {
                case "sum":
                    for (int i = 1; i < args.length; i++) {
                        result += Double.parseDouble(args[i]);
                    }
                    System.out.println("sum=" + result);
                    break;
                case "media":
                    for (int i = 1; i < args.length; i++) {
                        result += Double.parseDouble(args[i]);
                    }
                    System.out.println("media=" + result / (args.length - 1));
                    break;
                case "produs":
                    result = 1;
                    for (int i = 1; i < args.length; i++) {
                        result *= Double.parseDouble(args[i]);
                    }
                    System.out.println("produs=" + result);
                    break;

                default:
                    System.out.println("Invalid command");
            }
        } else {
            System.out.println("Invalid args");
        }
    }
}
