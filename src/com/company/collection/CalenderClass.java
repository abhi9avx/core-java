package com.company.collection;

import java.util.Calendar;
import java.util.TimeZone;

public class CalenderClass {
    public static void main(String[] args) {

        // Calendar is an abstract class that provides methods to get date, time, and timezone info
        // We get an instance of Calendar using the static method Calendar.getInstance()

        Calendar c = Calendar.getInstance(); // Gets instance using the default timezone (system timezone)

        // Prints the type of calendar system in use — typically "gregorian"
        System.out.println("Default Calendar Type: " + c.getCalendarType());

        // Prints the default system time zone
        System.out.println("Default Time Zone: " + c.getTimeZone().getID());

        // You can also specify a custom time zone — like Asia/Singapore
        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));

        // Prints the calendar type for the custom timezone (still "gregorian")
        System.out.println("Custom Calendar Type (Singapore): " + c1.getCalendarType());

        // Prints the ID of the custom timezone
        System.out.println("Custom Time Zone ID: " + c1.getTimeZone().getID());
    }
}

/*


⸻

📝 Extra Notes:
	•	Calendar class is part of the java.util package and helps in date/time manipulation.
	•	It’s abstract, so you can’t create it using new Calendar() — instead, use Calendar.getInstance().
	•	The calendar type returned is usually "gregorian" — representing the Gregorian calendar system (12 months, 28–31 days).
	•	To work with modern and cleaner APIs, Java recommends java.time package (since Java 8), like ZonedDateTime, LocalDateTime, etc.
 */