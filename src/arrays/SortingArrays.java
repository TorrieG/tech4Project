package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {

        System.out.println("\n----------Numbers----------");
        /*
        How to sort an array of numbers

        we will sort in ascending order
         */

        int[] numbers = {10, -5, 0, 0, 3, 0, 7, 9};

        System.out.println("My array is = "+ Arrays.toString(numbers));

        //sort in ascending order

        Arrays.sort(numbers);
        System.out.println("My array sorted = " + Arrays.toString(numbers));

        System.out.println("\n----------Characters----------");
        char[] chars = { 'A', 'b', 'z', 'H'};
        System.out.println("My characters array "+Arrays.toString(chars));
        Arrays.sort(chars);
        System.out.println("My characters array sorted"+Arrays.toString(chars));

        System.out.println("\n----------Words----------");
        String[] names = {"Adam", "adam", "Mary", "lucy"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

    }
}
