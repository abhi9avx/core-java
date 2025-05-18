package com.company.collection;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class CollectionBasic {
    public static void main(String[] args) {

        // ✅ ArrayList: A dynamic array that allows duplicate elements and maintains insertion order
        ArrayList<String> names = new ArrayList<>();
        names.add("Abhinav");
        names.add("Kumar");
        names.add("Abhinav"); // Allows duplicates
        System.out.println("ArrayList Elements: " + names);

        // ✅ Set: Does not allow duplicate elements
        // Using TreeSet which stores elements in sorted order
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // Duplicate will be ignored
        System.out.println("TreeSet Elements (Sorted & Unique): " + numbers);
    }
}