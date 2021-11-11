package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Exercise_15_Advance_Java {

    public static void main(String[] args) {
        // Problem 01 --> Creating a ArrayList and Displaying it.
        ArrayList<String> a = new ArrayList<>();
        a.add("Dilip");
        a.add("Arun");
        a.add("Gowrish");
        a.add("Ashish");
        a.add("Rahul");
        a.add("Dhoni");
        a.add("Manish");
        a.add("Mayank");
        a.add("Pawan Kalayan");

        for (String e : a) {
            System.out.println(e);
        }
        // Problem 02 --> Printing the Time format by HH:MM:SS
        Date d = new  Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        // Problem 03 --> Implementing the Problem 02 with the Calendar class.
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
//        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    // The above statement prints in the 12-hour format .

        // Problem 04 --> Implementing the Problem 02 with the Java.time API
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("The Current date " + ldt);

        DateTimeFormatter dtt = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String sd = ldt.format(dtt);
        System.out.println("Date after Formatting " + sd);

        // Problem 05 --> Creating a HashSet and implementing it.
        HashSet<Integer> hs = new HashSet<>();
        hs.add(23);
        hs.add(443);
        hs.add(200);
        hs.add(504);
        hs.add(893);
        hs.add(23); // Duplicate elements are ignored in the HashSet.
        System.out.println(hs);
    }

}
