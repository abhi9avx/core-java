package com.company.collection;

import java.util.HashSet;

public class Hash_Set_Collection {
    public static void main(String[] args) {
        // ✅ Creating a default HashSet
        HashSet<Integer> myHashSet = new HashSet<>();

        // ✅ Creating a HashSet with initial capacity 20 and load factor 0.3
        HashSet<Integer> myHashSet2 = new HashSet<>(20, 0.3f);

        // ✅ Adding elements (duplicates will be ignored automatically)
        myHashSet.add(3);
        myHashSet.add(23);
        myHashSet.add(33);
        myHashSet.add(31);
        myHashSet.add(37);
        myHashSet.add(3); // Duplicate, will not be added again

        // ✅ Displaying the HashSet (order is not guaranteed)
        System.out.println("HashSet elements: " + myHashSet);

        // ✅ Checking if a specific element exists
        System.out.println("Does HashSet contain 31? " + myHashSet.contains(31));
    }
}