package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertingListToEachOther {
    public static void main(String[] args) {

        /*


         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        System.out.println("The ArrayList is = " + numbers);

        // converting ArrayList to a LinkedList
        LinkedList<Integer> numbers2 = new LinkedList<>(numbers);
        System.out.println("The LinkedList is = "+numbers2);

        // converting LinkedList to an ArrayList
        ArrayList<Integer> numbers3 = new ArrayList<>(numbers2); // () is called constructor

        String[] namesArr = {"Kaly", "Torrie", "Taylor"};
        Vector<String> names = new Vector<>(Arrays.asList(namesArr));

        System.out.println("The Vector is = "+names);





    }
}
