package practice_07_1;

public class OpBinEx {
    public static void main(String[] args) {
        System.out.println(printBinary(1));
        System.out.println(printBinary(2));
        System.out.println(printBinary(3));
        System.out.println(printBinary(4));
        System.out.println(printBinary(5));

        System.out.println("\n3 =" + printBinary(3));
        System.out.println("3!=" + printBinary(~3));

        System.out.println();
        printBinary(1 | 2); // 1 and 2
        printBinary(1 & 3); // 1 and 3

        System.out.println();
        System.out.println("4    =" + printBinary(4));
        System.out.println("left =" + printBinary(4 << 1));
        System.out.println("right=" + printBinary(4 >> 1));
    }

    static String printBinary(int number) {
        String byteString = String.format("%8s", Integer.toBinaryString(number));
        return byteString.substring(byteString.length() - 8)
                .replace(' ', '0');
    }
}
