package arrays;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {

        String name;

        name = "John";

        int age = 45;

        System.out.println("Name is = " + name);
        System.out.println("Name is = " + age);

        /*
        The new trend is to have multiple students information
         */

        String[] names11;
        String[] names12 = new String[4];
        String[] names13 = {"Alex", "David", "Jennifer", "Jim"};


        String[] names = {"Alex", "Abe", "Yakeen"};
        int[] ages = {20, 21, 22};
        char[] favCharacters = {'A', '%', 'G'};
        double[] balances = {5.6, 15, 23.6};
        boolean[] doTheyLikeJava = {false, true, true};


        //HOW TO PRINT ARRAY
        System.out.println(names); // [Ljava.lang.String;@1b6d3586

        String namesToString = Arrays.toString(names); // not needed. just to demonstrate it is stored in a String
        System.out.println(namesToString); // [Alex, Abe, Yakeen]
        System.out.println(Arrays.toString(names));


        //HOW TO GET A SINGLE ELEMENT FROM AN ARRAY
        String nameAt1 = names[1];
        System.out.println(nameAt1); // Abe
        System.out.println(names[0]); // Alex
//        System.out.println(names[5]); // ArrayIndexOutOfBoundsException

        // HOW TO UPDATE AN ELEMENT -> Abe --> Abraham
        names[1] = "Abraham";
        System.out.println(Arrays.toString(names)); // [Alex, Abraham, Yakeen]

        // Alex's age is 20 and his fav char is A. His balance is 5.6, and he does Java is false.


        // HOW TO LOOP ARRAY USING FORI LOOP

        for (int i = 0; i <= 2; i++) {
            System.out.println(names[i] + "'s age is " + ages[i] + " and his fav char is " + favCharacters[i] + ".");


        }

    }
}
