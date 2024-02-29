package datastructures;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.addFirst(10); // Adds element at the beginning

        System.out.println(numbers); // Output: [5, 10, 20]

        // Remove first and last elements
        int first = numbers.poll(); // Removes and returns first element
        int last = numbers.pollLast(); // Removes and returns last element
        System.out.println(numbers); // Output: [10]

        // Add element at specific position
        numbers.add(1, 15);
        System.out.println(numbers); // Output: [10, 15, 20]
    }
}
