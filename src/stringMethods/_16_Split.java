package stringMethods;

import java.util.Arrays;

public class _16_Split {
    public static void main(String[] args) {

        String s = "Banana is nice";

        String[] sSplitFromSpaces = s.split(" ");

        System.out.println(Arrays.toString(sSplitFromSpaces)); // [Banana, is, nice]

        String[] sSplitFromI = s.split("is");
        System.out.println(Arrays.toString(sSplitFromI)); // [Banana ,  nice]

        String[] sSplitFromA = s.split("a");
        System.out.println(Arrays.toString(sSplitFromA)); // [B, n, n,  is nice]
    }
}
