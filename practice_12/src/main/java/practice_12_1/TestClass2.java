/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_12_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Arrays;

/**
 * https://docs.oracle.com/javase/tutorial/datetime/iso/format.html
 * mvn -f practice_12/pom.xml clean install exec:java -Dexec.args="2007-12-03 'd MMM uuuu'"
 * mvn -f practice_12/pom.xml clean install exec:java -Dexec.args="2007-12-03T10:15:30 'MMM d yyyy  hh:mm a'"
 * mvn -f practice_12/pom.xml clean install exec:java -Dexec.args="'d MMM uuuu'"
 * mvn -f practice_12/pom.xml exec:java -Dexec.args="'MMM d yyyy'"
 */
public class TestClass2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        Temporal date;
        DateTimeFormatter formatter;
        switch (args.length) {
            case 1:
                date = LocalDateTime.now();
                formatter = DateTimeFormatter.ofPattern(args[0]);
                break;
            case 2:
                date = args[0].length() == 10 ? LocalDate.parse(args[0]) : LocalDateTime.parse(args[0]);
                formatter = DateTimeFormatter.ofPattern(args[1]);
                break;
            default:
                System.out.println("Invalid args");
                return;
        }
        System.out.println(formatter.format(date));
    }
}
