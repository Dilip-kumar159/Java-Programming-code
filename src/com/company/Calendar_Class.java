package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar_Class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // It is an abstract class so only we get Instances
//        System.out.println("Current Time : " + c.getTime());
//        System.out.println("Current Second : " + c.get(Calendar.SECOND));
//        System.out.println("Current Minute : " + c.get(Calendar.MINUTE));
//        System.out.println("Current Hour : " + c.get(Calendar.HOUR));
//        System.out.println("Current Date : " + c.get(Calendar.DATE));
//        System.out.println("Current Month : " + c.get(Calendar.MONTH)); // Here index starts from 0
//        System.out.println("Current Year : " + c.get(Calendar.YEAR));

//        System.out.println("Current Date : " + c.getTime());
//        c.add(Calendar.YEAR,4);
//        System.out.println("After 4 years : " + c.getTime());
//        c.add(Calendar.YEAR, -5);
//        System.out.println("Before 5 years back : " + c.getTime());
//        c.add(Calendar.MONTH, 3);
//        System.out.println("After 3 months : " + c.getTime());
//        c.add(Calendar.MONTH, -3);
//        System.out.println("Before 3 months : " + c.getTime());

        System.out.println(c.getWeeksInWeekYear());

        System.out.println("Maximum number of weeks in a year is : " + c.getMaximum(Calendar.WEEK_OF_YEAR) );
        System.out.println("Maximum number of weeks in a Month is : " + c.getMaximum(Calendar.WEEK_OF_MONTH) );
        System.out.println("Minimum number of weeks in a Month is : " + c.getMinimum(Calendar.WEEK_OF_MONTH) );
        System.out.println("Maximum number of hours in a day is : " + c.getMaximum(Calendar.HOUR_OF_DAY) );

    }
}
