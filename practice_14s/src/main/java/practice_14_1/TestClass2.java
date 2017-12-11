/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_14_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class TestClass2 {
    public static void main(String[] args) {
        String[] days = {"monday", "saturday", "tuesday", "sunday", "friday"};
        MyList<String> dayList = new MyList();
        dayList.addAll(Arrays.asList(days));
        System.out.println(dayList);

        dayList.updateIf(it -> it.equals("friday"), it -> "black-" + it);
        System.out.println(dayList);

        dayList.updateIf(it -> !it.contains("friday"), it -> "no-black-" + it);
        System.out.println(dayList);
    }
}

class MyList<E> extends ArrayList<E> {
    public void updateIf(Predicate<? super E> con, UnaryOperator<E> operator) {
        for (int i = 0; i < size(); i++) {
            E element = get(i);
            if (con.test(element)) {
                set(i, operator.apply(element));
            }
        }
    }
}
