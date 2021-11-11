package com.company;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

import java.util.Calendar;
import java.util.Date;

public class Date_And_Time_Class_In_Java {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime()/1000/3600/24/365);
        // 1000 miliseconds is 1 second.
        // 1 minute = 3600 seconds to convert second to minutes
        // 1 hour = 3600 minutes to convert minute to hour which is 24 hours in a day.
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getYear()+1900); // because java starts the year with year 1900.
        // And all these methods are depreciated , none of them are not in use.


//        Date d1 = new Date(121, Calendar.OCTOBER,11);
//        System.out.println(d1);

    }

}
