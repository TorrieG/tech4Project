package collections;

import java.util.*;

public class ConvertingArrayToList {
    public static void main(String[] args) {

          /*
        Create a List and store below data - countries

        USA
        Brasilia
        Argentina
        France
        Belgium
        Germany
        Portugal

        Print your list

        RESULT:
        [USA, Brasilia, Argentina, France, Belgium, Germany, Portugal]
         */

        String[] countries = {"USA", "Brasilia", "Argentina", "France", "Belgium", "Germany", "Portugal"};

        //WAY - 1 to convert Array to List (ArrayList or LinkedList)
        List<String> countries1 = new ArrayList<>(Arrays.asList(countries));
        List<String> countries2 = new LinkedList<>(Arrays.asList(countries));
        System.out.println(countries1);
        System.out.println(countries2);

        //WAY-2 to convert Array to List (ArrayList or LinkedList)
        List<String> countries3 = new ArrayList<>();
        List<String> countries4 = new LinkedList<>();

        Collections.addAll(countries3, countries);
        Collections.addAll(countries4, countries);

        System.out.println(countries3);
        System.out.println(countries4);

        //WAY-3

        int[] numbers = {1,2,3,4,5};
        List<Integer> numbersList = new ArrayList<>(); // LinkedList

        for (int element : numbers) { // Autoboxing
            numbersList.add(element);
        }
        System.out.println(numbersList);

    }
}
