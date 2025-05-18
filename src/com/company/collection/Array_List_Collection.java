package com.company.collection;

import java.util.ArrayList;

public class Array_List_Collection {
    public static void main(String[] args) {

        // ✅ Creating ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>(); // Default size
        ArrayList<Integer> list2 = new ArrayList<>(7); // Initial capacity of 7

        // ✅ Adding elements to list2
        list2.add(12);
        list2.add(34);
        list2.add(23);

        // ✅ Adding elements to list1
        list1.add(4); // Appends at end
        list1.add(6);
        list1.add(0, 6); // Inserts 6 at index 0, shifts existing right
        list1.add(0, 7); // Inserts 7 at index 0, becomes new first element

        // ✅ Check element index
        System.out.println("First index of 23: " + list1.indexOf(23)); // -1 if not found
        System.out.println("Last index of 23: " + list1.lastIndexOf(23));

        // ✅ Append all elements from list2 to list1
        list1.addAll(list2); // Appends list2 at end of list1

        // ✅ Clear list2
        list2.clear();

        // ✅ Check for presence of an element
        System.out.println("Contains 71? " + list1.contains(71));

        // ✅ Remove element by index
        if (list1.size() > 7) {
            System.out.println("Removed element at index 7: " + list1.remove(7));
        } else {
            System.out.println("Index 7 is out of bounds, cannot remove.");
        }

        // ✅ Set/replace value at a specific index
        if (list1.size() > 1) {
            list1.set(1, 455); // Replaces element at index 1 with 455
        }

        // ✅ Iterating using for loop
        System.out.println("Elements of list1:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("Index " + i + ": " + list1.get(i));
        }

        // ✅ Additional common methods (for reference):
        // list.size()             -> Returns the number of elements
        // list.isEmpty()          -> Checks if list is empty
        // list.remove(Integer.valueOf(12)) -> Removes first occurrence of 12
        // list.subList(1, 3)      -> Returns elements from index 1 to 2
    }
}

/*
Method -> Description
add() -> Adds element to end
add(index, value) -> Inserts at specific index
addAll() -> Appends all elements from another list
clear() -> Removes all elements
contains() -> Checks if element is in the list
remove(index) -> Removes element at index
set(index, value) -> Updates element at index
get(index) -> Retrieves element at index
indexOf(value) -> Returns first index of element
lastIndexOf() -> Returns last index of element
size() -> Total number of elements


✅ Use ArrayList when:
	1.	Frequent Read/Access Operations
	•	If you access elements using index often (list.get(i)), ArrayList is faster.
	•	Internally backed by an array, so index-based access is O(1) (very fast).
	2.	Rare Insertions/Deletions in the Middle
	•	Adding/removing elements in the middle or beginning is slow (O(n)), because it shifts elements.
	•	Best when you only add/remove at the end.
	3.	Memory-Efficient
	•	Takes less memory compared to LinkedList (no node objects, no extra pointers).

📌 Use Case Examples:
	•	Storing a list of user names or IDs
	•	Frequent get() and set() operations
	•	When size changes are occasional

🧠 In Simple Words:
	•	ArrayList = Fast access, ideal when modifying less
	•	LinkedList = Fast insert/delete, ideal for dynamic changes
 */