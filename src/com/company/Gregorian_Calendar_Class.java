package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gregorian_Calendar_Class {
    public static void main(String[] args) {
        GregorianCalendar gcal = new GregorianCalendar(); // It is a concrete class so created a new object.
        System.out.println(gcal.getTime());
        System.out.println(gcal.getTimeZone().getID());

        System.out.println(gcal.isLeapYear(2000));
        System.out.println(gcal.isLeapYear(2021));

        System.out.println("Date before rolling : " + gcal.getTime());
        gcal.roll(Calendar.MONTH,true);
        gcal.roll(Calendar.DATE,false);
        gcal.roll(Calendar.YEAR,true);
        gcal.roll(Calendar.HOUR,false);
        System.out.println("Date after rolling : " + gcal.getTime());
    }
}
