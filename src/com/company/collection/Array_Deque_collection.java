package com.company.collection;

import java.util.ArrayDeque;

public class Array_Deque_collection {
    public static void main(String[] args) {
        // ✅ Creating an ArrayDeque of Integer type
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();

        // ✅ Adding elements (by default adds at end)
        ad1.add(5);
        ad1.add(56);
        ad1.add(3);

        // ✅ Adding at specific ends
        ad1.addFirst(35); // Adds at beginning
        ad1.addLast(34);  // Adds at end

        // ✅ Retrieving elements without removing
        System.out.println("First element: " + ad1.getFirst());
        System.out.println("Last element: " + ad1.getLast());

        // ✅ Peek methods (safe retrieval, returns null if empty)
        System.out.println("Peek First: " + ad1.peekFirst());
        System.out.println("Peek Last: " + ad1.peekLast());

        // ✅ Removing from both ends
        ad1.removeFirst(); // Removes head
        ad1.removeLast();  // Removes tail

        // ✅ Check if empty and size
        System.out.println("Is deque empty? " + ad1.isEmpty());
        System.out.println("Size of deque: " + ad1.size());

        // ✅ Iterating through all elements
        System.out.println("Deque elements:");
        for (Integer value : ad1) {
            System.out.println(value);
        }

        // ✅ Clearing the deque
        ad1.clear();
        System.out.println("Deque cleared. Is now empty? " + ad1.isEmpty());
    }
}

/*

🔁 Common ArrayDeque Methods in Java (Point-wise):
	•	add(e)
➤ Adds the element at the end of the deque.
	•	addFirst(e)
➤ Adds the element at the beginning of the deque.
	•	addLast(e)
➤ Adds the element at the end, same as add().
	•	getFirst()
➤ Retrieves (but does not remove) the first element.
➤ Throws an exception if the deque is empty.
	•	getLast()
➤ Retrieves (but does not remove) the last element.
➤ Throws an exception if the deque is empty.
	•	peekFirst()
➤ Safely retrieves the first element.
➤ Returns null if the deque is empty.
	•	peekLast()
➤ Safely retrieves the last element.
➤ Returns null if the deque is empty.
	•	removeFirst()
➤ Removes and returns the first element.
	•	removeLast()
➤ Removes and returns the last element.
	•	isEmpty()
➤ Checks if the deque is empty.
➤ Returns true if empty, false otherwise.
	•	size()
➤ Returns the number of elements present in the deque.
	•	clear()
➤ Removes all elements from the deque, making it empty.

⸻


 */