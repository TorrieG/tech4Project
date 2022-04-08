package arrays;

import java.util.Arrays;

public class FruitsCollections {
    public static void main(String[] args) {


        /*
        Task - 1
        Create an
         */
        String[] fruits = new String[4];
        System.out.println(Arrays.toString(fruits)); // [null, null, null, null]

        /*
        Task - 2
        store your fav fruit in the index of 0
        store the 4th fav fruit int the index of 3
         */
        fruits[0] = "orange";
        fruits[3] = "pineapple";
        System.out.println(Arrays.toString(fruits)); // [orange, null, null, pineapple]

        /*
        task - 4
        find how many elements you have in the array

        expected output:
        4
         */

        System.out.println(fruits.length); // 4

        /*
        Task - 4
        print elements at the index
         */

        System.out.println(fruits[0] + " and " + fruits[3]);// orange and pineapple

        //What if we try to get a value of null
        System.out.println(fruits[1]); // null
        System.out.println(fruits[0].charAt(1)); // r
        System.out.println(fruits[0].length()); // 6

//        System.out.println(fruits[1].length()); // NullPointerException

    }

}
