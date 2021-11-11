package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Java_Time_package {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

//        // To compare()
//        LocalDate d1 = LocalDate.parse("2021-05-27");
//        LocalDate d2 = LocalDate.parse("2020-02-21");
//        LocalDate d3 = LocalDate.parse("2020-02-21");
//        System.out.println(d1.equals(d2));  // d1 and d2 are not equal , so output is false, it returns boolean type.
//        System.out.println(d2.equals(d3)); // d2 and d3 are equal , so output is true.
//
////        LocalDate d1 = LocalDate.parse("2021-05-27");
//        System.out.println(d1.withYear(2001));
//        System.out.println(d1.withMonth(4));
//        System.out.println(d1.withDayOfMonth(1));
//        System.out.println(d1.withDayOfYear(23));

        LocalTime t = LocalTime.now();
        System.out.println(t);
//        System.out.println(LocalTime.now()); // This Statement also works

        LocalTime t1 = LocalTime.of(7,26,23);
        System.out.println("Time before adding the hours and minutes and minus the second " + t1);

        LocalTime t2 = t1.plusHours(5);
        LocalTime t3 = t1.plusMinutes(4);
        LocalTime t4 = t1.minusSeconds(20);
        System.out.println("Time after adding the hours and minutes and minus the second " + t2);
        System.out.println("Time after adding the hours and minutes and minus the second " + t3);
        System.out.println("Time after adding the hours and minutes and minus the second " + t4);
    }
}
