package collections.linkedLists;

import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);

        System.out.println(numbers); // [10.5, 12.5, 13.3, 17.7]

        for (Double number : numbers) {
            System.out.println(number);
        }

        System.out.println(numbers.get(0));
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());

        System.out.println("\n-----Some additional methods of LinkedList");
        System.out.println(numbers.peek());
        System.out.println(numbers.peekFirst());
        System.out.println(numbers.peekLast());

        System.out.println(numbers); // [10.5, 12.5, 13.3, 17.7]

        System.out.println("\n-------------------------------------------");

        System.out.println(numbers.poll()); // retrieves the first element and removes it
        System.out.println(numbers.pollFirst()); // retrieves the first element and removes it
        System.out.println(numbers.pollLast()); // retrieves the last element and removes it
        System.out.println(numbers); //[13.3]

        System.out.println("\n-----------------------------");
        numbers.push(5.7); // adds the object to the index of 0 (head)
        numbers.push(8.9);
        System.out.println(numbers.pop()); // removes the object in the index of 0 (head)


    }
}
