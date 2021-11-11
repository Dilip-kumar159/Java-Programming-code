package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("The current date : " + dt);

//        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // This is the custom date format.
//        String myDate = dt.format(df);
//        System.out.println("Date after Formatting : " + myDate);

//        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;
//        String myDate = dt.format(df);
//        System.out.println("Date after Formatting : " + myDate);
//
//        DateTimeFormatter df = DateTimeFormatter.ISO_WEEK_DATE;
//        String myDate = dt.format(df);
//        System.out.println("Date after Formatting : " + myDate);

        DateTimeFormatter df = DateTimeFormatter.ISO_ORDINAL_DATE;
        String myDate = dt.format(df);
        System.out.println("Date after Formatting : " + myDate);


    }
}
