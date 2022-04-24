package collectionsFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class Exercise02_find_second_greatest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(3);

        TreeSet<Integer> uniques = new TreeSet<>(numbers);

        ArrayList<Integer> uniquesList = new ArrayList<>(uniques);
        System.out.println(uniquesList.get(uniquesList.size()-2));// 2nd max
        System.out.println(uniquesList.get(1));// 2nd min
    }
}
