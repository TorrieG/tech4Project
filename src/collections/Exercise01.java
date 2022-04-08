package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {

        /*
        Create a list
        Print the list
        Then, remove Miami and Dallas
        Print the list again

        RESULT:
        [Berlin, Chicago, Dallas, Miami, Brugge, Kiev]
        [Berlin, Chicago, Brugge, Kiev]
         */
        String[] cities = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};

        List<String> cities1 = new ArrayList<>(Arrays.asList(cities));
        List<String> cities2 = new LinkedList<>(Arrays.asList(cities));

        System.out.println(cities1);
        System.out.println(cities2);

        cities1.remove(3);
        cities2.remove(3);
        cities1.remove("Dallas");
        cities2.removeIf(element -> element.equals("Dallas"));

        System.out.println(cities1);
        System.out.println(cities2);





    }
}
