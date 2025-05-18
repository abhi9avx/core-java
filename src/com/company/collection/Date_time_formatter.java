package com.company.collection;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_time_formatter {
    public static void main(String[] args) {

        // ✅ Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current DateTime (Default Format): " + currentDateTime);

        // ✅ Define the desired format for the date
        // Pattern: "dd-MM-yyyy" means Day-Month-Year (e.g., 18-05-2025)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // ✅ Format the LocalDateTime to a string using the defined pattern
        String formattedDate = currentDateTime.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }
}