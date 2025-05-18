package com.company.collection;

import java.util.Date;

public class Date_class {
    public static void main(String[] args) {

        // Displaying the maximum and minimum value that a long can store
        // This helps us understand the range of time that can be measured using milliseconds
        System.out.println("Maximum value of long: " + Long.MAX_VALUE);
        System.out.println("Minimum value of long: " + Long.MIN_VALUE);

        // Getting the current time in milliseconds since Jan 1, 1970 (Epoch)
        System.out.println("Current time in milliseconds since Jan 1, 1970:");
        System.out.println(System.currentTimeMillis());

        // Creating a new Date object — this stores the current date and time
        Date d = new Date();

        // Printing the current date and time in a readable format
        System.out.println("\nCurrent date and time: " + d);

        // Getting the time in milliseconds since the epoch (1 Jan 1970)
        System.out.println("Milliseconds since Jan 1, 1970: " + d.getTime());

        // ⚠️ The methods below are deprecated and not recommended for use in modern Java
        // They still work but have been replaced by the java.time API since Java 8

        System.out.println("Day of the month: " + d.getDate());       // Deprecated
        System.out.println("Year since 1900: " + d.getYear());       // Deprecated
    }
}