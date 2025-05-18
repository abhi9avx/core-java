package com.company.collection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java_Time {
    public static void main(String[] args) {

        // ✅ Getting current date using LocalDate
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate); // Format: YYYY-MM-DD

        // ✅ Getting current time using LocalTime
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime); // Format: HH:MM:SS.nanoseconds

        // ✅ Getting current date and time using LocalDateTime
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date & Time: " + currentDateTime); // Format: YYYY-MM-DDTHH:MM:SS.nanoseconds
    }
}

/*
📌 Explanation:
	•	LocalDate.now() → Gives the current date without time.
	•	LocalTime.now() → Gives the current time without date.
	•	LocalDateTime.now() → Combines both date and time into a single object.
	•	These classes are part of java.time package (introduced in Java 8), which is the recommended and modern approach for date and time handling in Java.
 */