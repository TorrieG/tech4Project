package arrays;

import java.util.Arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {

        System.out.println("\nTASK-1");
         /*
        TASK-1
        Assume you are given a String as below
        Please find how many words you have in the given String

        String s1 = "Today is Tuesday";

        RESULT:
        3
         */

        String s1 = "Today is Tuesday";
        String[] words = s1.split(" ");

        System.out.println(words.length);

        System.out.println("\nTASK-2");

        /*
        TASK-2
        Assume you are given a String as below
        Please find how many words you have in the given String starts with A or a

        String s2 = "Some countries I visited were Argentina, Belgium and Malta";

        RESULT:
        2
         */

        String s2 = "Some countries I visited were Argentina, Belgium and Malta";

        int countA = 0;
        for (String s : s2.split(" ")) {
            if (s.toLowerCase().startsWith("a")) countA++;
        }
        System.out.println(countA);

    }
}
