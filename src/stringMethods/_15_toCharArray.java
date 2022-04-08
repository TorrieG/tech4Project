package stringMethods;

import java.util.Arrays;

public class _15_toCharArray {
    public static void main(String[] args) {

        String s = "Java";

        char[] chars = "Java".toCharArray();
        //char[] chars = s.toCharArray();

        System.out.println(Arrays.toString(chars));

        int countA = 0;
        for (char aChar : chars) {
            if (aChar == 'a') countA++;
        }
        System.out.println(countA);


        //System.out.println(Arrays.toString(s.toCharArray()));

        System.out.println(Arrays.toString("Hello".toCharArray())); // [H, e, l, l, o]
    }
}
