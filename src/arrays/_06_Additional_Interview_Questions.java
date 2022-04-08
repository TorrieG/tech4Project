package arrays;

import java.util.Arrays;

public class _06_Additional_Interview_Questions {
    public static void main(String[] args) {

        System.out.println("\nTASK-1");
        /*
        int[] numbers = {5, 3, 0, -5};

        Find the greatest and print it

        RESULT:
        {5, 3, 0, -5} -> 5
        {4, 10, 15} -> 15
         */
        int[] numbers = {5, 3, 0, -5};
//        Arrays.sort(numbers);
//        System.out.println(numbers[numbers.length-1]);
        int greatest = numbers[0];
        for (int number : numbers) {
            //if(number > greatest) greatest = number;
            greatest = Math.max(greatest, number);
        }
        System.out.println(greatest);

        System.out.println("\nTASK-2");
        /*
        Create a double array and store below elements
{2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25}

Find the minimum value

RESULT:
0.5
         */
        double[] doubles = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};

        double least = numbers[0];

        for (double aDouble : doubles) {
            least = Math.min(least, aDouble);
        }
        System.out.println(least);

        double minValue = Double.MAX_VALUE;
        for (double aDouble : doubles) {
            minValue = Math.min(minValue, aDouble);
        }
        System.out.println(minValue);
        System.out.println("\nTASK-3");

        double minValue2 = Double.MAX_VALUE;
        for (double number : doubles) {
            if (number != minValue && number < minValue2) minValue2 = number;
        }
        System.out.println(minValue2);


    }
}
