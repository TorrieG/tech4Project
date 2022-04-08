package arrays;

import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] args) {


        System.out.println("\n----------TASK-1----------");
        char[] chars = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(chars));

        System.out.println("\n----------TASK-2----------");
        //print the size of the array with a message
        System.out.println("The size of the array is = " + chars.length);

        System.out.println("\n----------TASK-3----------");
        //print each element using fori loop
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("\n----------TASK-4----------");
        // print each element using for each loop
        for(char characters : chars){
            System.out.println(characters);
        }
        System.out.println("\n----------TASK-5-fori-loop----------");
        //print each element that is a letter
        for (int i = 0; i < chars.length; i++) {
            if(Character.isLetter(chars[i])) System.out.println(chars[i]);

        }
        System.out.println("\n----------TASK-5-for-each-loop----------");
        for(char characters : chars){
            if(Character.isLetter(characters)) System.out.println(characters);
        }
        System.out.println("\n----------TASK-6-fori-loop----------");
        //print how many uppercase
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if(Character.isUpperCase(chars[i])) count++;
        }
        System.out.println(count);

        System.out.println("\n----------TASK-6-for-each-loop----------");
        count = 0;
        for (char character: chars) {
            if (Character.isUpperCase(character)) count++;
        }
        System.out.println(count);

        /*
        EXTRA PRACTICES
        Count lowercase letters
        Count digits
        Count spaces
        Count specials
         */
    }
}
