package com.company.collection;

import java.util.LinkedList;

public class LinkedList_collection {
    public static void main(String[] args) {

        // ✅ Creating LinkedLists
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // ✅ Adding elements to list2
        list2.add(12);           // Add to end
        list2.add(34);
        list2.add(23);

        // ✅ Adding elements to list1
        list1.add(10);           // Add to end
        list1.addFirst(5);       // Add to beginning
        list1.addLast(15);       // Add to end (same as add())

        // ✅ Adding element at specific index
        list1.add(1, 7); // Inserts 7 at index 1

        // ✅ Appending another list
        list1.addAll(list2);     // Add all elements of list2 to end of list1

        // ✅ Accessing elements
        System.out.println("Element at index 2: " + list1.get(2));
        System.out.println("First element: " + list1.getFirst());
        System.out.println("Last element: " + list1.getLast());

        // ✅ Check for existence
        System.out.println("Contains 23? " + list1.contains(23));

        // ✅ Remove operations
        list1.removeFirst();     // Removes first element
        list1.removeLast();      // Removes last element
        list1.remove(Integer.valueOf(34)); // Removes first occurrence of 34

        // ✅ Set (replace) value at a specific index
        list1.set(1, 100);       // Replaces element at index 1 with 100

        // ✅ Iterating through LinkedList
        System.out.println("Elements in list1:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("Index " + i + ": " + list1.get(i));
        }

        // ✅ Other useful methods (for your reference):
        // list.size()            -> Total number of elements
        // list.isEmpty()         -> Returns true if list is empty
        // list.indexOf(23)       -> Returns index of first occurrence
        // list.lastIndexOf(23)   -> Returns index of last occurrence
        // list.clear()           -> Removes all elements
        // list.peek(), poll()    -> Queue-style access (head element)
    }
}

/*
Method -> Description
add(), addFirst(), addLast() -> Add element at specific positions
add(index, value) -> Insert at a particular index
addAll(collection) -> Append another list
get(), getFirst(), getLast() -> Access elements
remove(), removeFirst(), removeLast() -> Remove elements
remove(value) - > Removes first occurrence of a value
set(index, value) -> Replace element at index
contains(value) -> Checks if list contains a value
indexOf(value) -> Finds first index of value
clear() -> Clears all elements
isEmpty() -> Checks if list is empty

 */