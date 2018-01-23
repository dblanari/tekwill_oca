package lowest_number;

import java.util.Arrays;

public class Kata {
    public static int sum(int[] numbers) {
        Arrays.sort(numbers);
        int sum = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
