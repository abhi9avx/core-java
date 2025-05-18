package com.company.collection;

import java.util.HashMap;

public class Hash_Map_Collection {
    public static void main(String[] args) {
        // ✅ Creating a default HashMap
        HashMap<String, Integer> marks = new HashMap<>();

        // ✅ Adding key-value pairs to the HashMap
        marks.put("Abhinav", 85);
        marks.put("Ravi", 78);
        marks.put("Sneha", 92);
        marks.put("Amit", 88);

        // ✅ Updating value for an existing key
        marks.put("Abhinav", 90); // This will overwrite 85 with 90

        // ✅ Displaying the entire map
        System.out.println("Marks Map: " + marks);

        // ✅ Getting a value by key
        System.out.println("Marks of Sneha: " + marks.get("Sneha"));

        // ✅ Checking if a key or value exists
        System.out.println("Contains key 'Ravi'? " + marks.containsKey("Ravi"));
        System.out.println("Contains value 100? " + marks.containsValue(100));

        // ✅ Removing a key-value pair
        marks.remove("Amit");
        System.out.println("After removing 'Amit': " + marks);

        // ✅ Iterating over key-value pairs
        System.out.println("Iterating over keys and values:");
        for (String name : marks.keySet()) {
            System.out.println(name + " -> " + marks.get(name));
        }

        // ✅ Getting size and checking if map is empty
        System.out.println("Size of map: " + marks.size());
        System.out.println("Is map empty? " + marks.isEmpty());

        // ✅ Clearing all entries
        marks.clear();
        System.out.println("After clearing: " + marks);
    }
}