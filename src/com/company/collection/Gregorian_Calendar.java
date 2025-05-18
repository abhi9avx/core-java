package com.company.collection;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gregorian_Calendar {
    public static void main(String[] args) {

        // Getting an instance of Calendar (which internally returns a GregorianCalendar)
        Calendar calendar = Calendar.getInstance();

        // Printing the system's default time zone
        System.out.println("Time Zone: " + calendar.getTimeZone().getID());

        // Printing the current date (day of the month)
        System.out.println("Today's Date: " + calendar.get(Calendar.DATE));

        // Printing the full current date and time
        System.out.println("Full Date & Time: " + calendar.getTime());

        // Printing the current second
        System.out.println("Current Second: " + calendar.get(Calendar.SECOND));

        // Printing the current time in hour:minute:second format
        int hour = calendar.get(Calendar.HOUR);       // 12-hour format
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println("Current Time: " + hour + " : " + minute + " : " + second);

        // Creating an instance of GregorianCalendar to check leap year
        GregorianCalendar gCal = new GregorianCalendar();

        // Checking if a specific year is a leap year
        int yearToCheck = 2025;
        boolean isLeap = gCal.isLeapYear(yearToCheck);
        System.out.println("Is " + yearToCheck + " a leap year? " + isLeap);
    }
}