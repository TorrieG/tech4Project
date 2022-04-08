package arrays;

import java.util.Arrays;

public class NumbersCollection {
    public static void main(String[] args) {

        /*
        Create an array to store 1, 2, 3
        print array
         */
        int[] ints = {1, 2, 3};
        System.out.println(Arrays.toString(ints)); // [1, 2, 3]

        int a = 0, b = ints[ints.length-1];
        System.out.println(Arrays.toString(ints));
    }
}
