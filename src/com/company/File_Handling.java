package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) {

        // 1️⃣ Create a file named "abhinav.txt"
        File myFile = new File("abhinav.txt");
        try {
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Unable to create this file.");
            e.printStackTrace();
        }

        // 2️⃣ Write content to the file
        try {
            FileWriter fileWriter = new FileWriter("abhinav.txt");
            fileWriter.write("This is our first file from this Java course.\nLet's practice reading and writing.");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // 3️⃣ Read the content from the file
        try {
            Scanner sc = new Scanner(myFile);
            System.out.println("Reading content from file:");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found while reading.");
            e.printStackTrace();
        }

        // 4️⃣ Delete the file
        if (myFile.delete()) {
            System.out.println("File deleted successfully: " + myFile.getName());
        } else {
            System.out.println("Error occurred while deleting the file.");
        }
    }
}


/*

Reading and writing is import aspect of any programing language
we can use the file class in java to create a file object
create NewFile() method -> create  new file object

For reading file we can use the same scanner class and supply it a file object

for delete a file in java we can use File Object delete() method

📘 Notes:
	•	File.createNewFile() → Creates a file if it doesn’t exist.
	•	FileWriter.write() → Writes string content to the file.
	•	Scanner.nextLine() → Reads each line from the file.
	•	File.delete() → Deletes the file from disk.

 */
