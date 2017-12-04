package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BubbleSort {
    private static Random randorm = new Random();

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        list.add(3);list.add(1);list.add(5);list.add(9);list.add(8);

        randomPopulate(list, 20);

        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

    public static void randomPopulate(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(randorm.nextInt(100));
        }
    }

    public static void sort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Integer temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
