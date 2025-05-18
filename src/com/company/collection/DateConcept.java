package com.company.collection;

public class DateConcept {
    public static void main(String[] args) {

        // Get the current time in milliseconds since Jan 1, 1970 (Epoch Time)
        long currentMillis = System.currentTimeMillis();

        System.out.println("Current time in milliseconds since Jan 1, 1970:");
        System.out.println(currentMillis);

        // Convert milliseconds to seconds
        long seconds = currentMillis / 1000;
        System.out.println("\nSeconds since Jan 1, 1970: " + seconds);

        // Convert milliseconds to minutes
        long minutes = currentMillis / (1000 * 60);
        System.out.println("Minutes since Jan 1, 1970: " + minutes);

        // Convert milliseconds to hours
        long hours = currentMillis / (1000 * 60 * 60);
        System.out.println("Hours since Jan 1, 1970: " + hours);

        // Convert milliseconds to days
        long days = currentMillis / (1000 * 60 * 60 * 24);
        System.out.println("Days since Jan 1, 1970: " + days);

        // Convert milliseconds to approximate years
        long years = currentMillis / (1000L * 60 * 60 * 24 * 365);
        System.out.println("Approximate years since Jan 1, 1970: " + years);
    }
}

/*
✅ Explanation:
	•	System.currentTimeMillis() returns the time in milliseconds since 1 Jan 1970.
	•	Dividing by:
	•	1000 gives seconds
	•	1000 * 60 gives minutes
	•	1000 * 60 * 60 gives hours
	•	1000 * 60 * 60 * 24 gives days
	•	1000L * 60 * 60 * 24 * 365 gives approximate years
 */