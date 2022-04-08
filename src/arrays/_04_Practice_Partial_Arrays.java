package arrays;

import java.util.Arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {

        System.out.println("\n----------TASK-1----------");
        /*
        Create an array to store below numbers
        10, -3, -7, 0, 0, 7, 22
        Print all elements one by one in separate lines using FOR EACH LOOP
        RESULT:
        10
        -3
        -7
        0
        0
        7
        22
         */
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        for (int number : numbers) {
            System.out.println(number);


        } System.out.println("\n----------TASK-2----------");
        /*
        TASK-2
        Find the sum of all the elements

        RESULT:
        29
         */

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        System.out.println("\n----------TASK-3----------");
        /*
        find the sum of the first 3 elements
        result:
        0
         */
        sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        System.out.println("\n----------TASK-4----------");
        /*
        find the sum of the last 5 elements in the array
        RESULT:
        22
         */
        sum = 0;
        for (int i = numbers.length-5; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        System.out.println("\n----------TASK-5----------");
        /*
        find the product of the last 4 elements in the array not including 0
        RESULT:
        154
         */
        int product = 1;
        for (int i = numbers.length-4; i < numbers.length; i++) {
            int number = numbers[i];
           if (number != 0) product *= number;
        }
        System.out.println(product);

        System.out.println("\n----------TASK-6----------");
        /*
        check collection and print true if one of the elements is 0
        and false if none of the elements is zero
        RESULT:
        true
         */

        boolean zero = false;
        for (int number : numbers) {
            if (number == 0) {
                zero = true;
                break;
            }


        } System.out.println(zero);



    }
}
