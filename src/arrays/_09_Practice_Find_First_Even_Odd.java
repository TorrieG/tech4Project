package arrays;

import java.util.Arrays;

public class _09_Practice_Find_First_Even_Odd {
    public static void main(String[] args) {


        int[] numbers = {0, 5, 3, 2, 4, 7, 10};
        /*
        First even = 0
        First odd = 5
         */
        int countEven = 0;
        int countOdd = 0;
        for (int number : numbers) {
            if (number % 2 == 0 && countEven == 0) {
                System.out.println("First even number is: " + number);
                countEven++;
            } else if (number % 2 == 1 && countOdd == 0) {
                System.out.println("First odd number is: " + number);
                countOdd++;
            }
            if (countEven == 1 && countOdd == 1) break;
        }
        System.out.println("\n--------A different way--------");
        boolean isFirstEvenFound = false;
        boolean isFirstOddFound = false;

        for (int number : numbers) {
            if (number % 2 == 0 && !isFirstEvenFound) {
                isFirstEvenFound = true;
                System.out.println("First Even = " + number);
            } else if (!isFirstOddFound) {
                isFirstOddFound = true;
                System.out.println("First Odd = " + number);
            }

            if (isFirstEvenFound && isFirstOddFound) break;
        }

        if (!isFirstEvenFound) System.out.println("There is no even in this array");
        if (!isFirstOddFound) System.out.println("There is no odd in this array");


    }

}
