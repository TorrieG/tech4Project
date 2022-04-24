package collectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {

        /*
        How to create a HashSet

        Mostly used when you want your elements to be unique like ssn, telephone #, email, address
         */

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);//does not allow duplicates
        numbers.add(10);
        numbers.add(10);
        numbers.add(null);//allows nulls
        numbers.add(null);
        numbers.add(null);//allows nulls
        numbers.add(-3);
        numbers.add(0);
        numbers.add(-7);

        System.out.println(numbers);//[0, -3, 5, -7, 10] doesn't reserve insertion order
    }
}
