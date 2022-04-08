package arrays;

import java.util.Arrays;

public class _03_Practice_Int_Array {
    public static void main(String[] args) {
        System.out.println("\n----------TASK-1----------");
        /*
        create an int array and store below data
        -3...15
        print array with message "Array not sorted = "
        print sorted array with message "Array sorted = "
         */
        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};
        System.out.println("Array not sorted = " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Array sorted = " + Arrays.toString(numbers));

        System.out.println("\n----------TASK-2----------");
        /*
        count how many positive, negative and zero numbers

        EXPECTED:
        Positives = 6
        Negatives = 2
        Zeros = 2
         */


        int p = 0;
        int n = 0;
        int z = 0;
        for (int number : numbers) {
            if (number > 0) p++;
            else if (number < 0) n++;
            else z++;
        }
        System.out.println("Positives = " + p);
        System.out.println("Negatives = " + n);
        System.out.println("Zeros = " + z);

        System.out.println("\n----------TASK-2-another-way----------");
        int pos = 0, neg = 0;

        for (int number : numbers) {
            if(number > 0) pos++;
            else if(number < 0) neg++;
        }

        System.out.println("Positives = " + pos);
        System.out.println("Negatives = " + neg);
        System.out.println("Zeros = " + (numbers.length - pos - neg));

        System.out.println("\n----------TASK-3-----------");
        /*
        count how many even and odds
        EXPECTED:
        Evens = 5
        Odds = 5
         */
        int even = 0;
        for (int number : numbers) {
            if (number % 2 ==0) even++;
        }
        System.out.println("Evens = "+even);
        System.out.println("Odds = "+(numbers.length -even));

        /*
        EXTRA PRACTICE
        
        Numbers that are more than 7 -> 2
        Numbers that can be divided by 5 -> 4
        Numbers can be divided by 2 but not by 3 -> 3
        Check if it contains 10 -> true
        Check if it contains 8 -> false

        Please do this
        Count how many numbers are 2 digits
         */

    }
}
