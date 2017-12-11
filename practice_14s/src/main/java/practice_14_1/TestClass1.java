/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_14_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class TestClass1 {
    public static void main(String[] args) {
        String[] days = {"monday", "saturday", "tuesday", "sunday", "friday"};

        ArrayList<String> dayList = new ArrayList(Arrays.asList(days));
        System.out.println(dayList);

        dayList.replaceAll(s -> s.toUpperCase());
        dayList.replaceAll((String s) -> { return s.toUpperCase(); });
        System.out.println(dayList);

        System.out.println(copyList(dayList, (it -> Integer.toString(it.length()))));
        System.out.println(copyList(dayList, (it -> it.substring(0,3))));

        System.out.println(contains(dayList, f -> f.equalsIgnoreCase("monday")));
        System.out.println(contains(dayList, f -> f.equals("monday")));

        Integer[] num = {1, 2, 3, 4, 5};
        ArrayList<Integer> numberList = new ArrayList(Arrays.asList(num));
        System.out.println(contains(numberList, f -> f == 5));
        System.out.println(contains(numberList, f -> f == 6));
    }


    static <T> boolean contains(List<T> list, Predicate<? super T> filter) {
        boolean condition = false;
        for (T item : list) {
            condition |= filter.test(item);
            if (condition == true) {
                break;
            }
        }
        return condition;
//        return list.stream().anyMatch(filter);
    }


    static <T> List<T> copyList(List<T> list, UnaryOperator<T> operator) {
        List<T> newList = new ArrayList<>();
        list.forEach(it -> newList.add(operator.apply(it)));
        return newList;
    }
}
