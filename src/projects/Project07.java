package projects;

import java.util.Arrays;
import java.util.Objects;

public class Project07 {
    public static void main(String[] args) {


        System.out.println("Testing Project-7");

        int[] numbers = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallest(numbers);

        String[] strings1 = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(strings1);


        String[] strings = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findMostRepeatedElementInAnArray(strings);

    }

    //TASK-1
    public static void findGreatestAndSmallestWithSort(int[] num) {
        Arrays.sort(num);
        int greatest = num[num.length - 1], smallest = num[0];
        System.out.println("Smallest = " + smallest);
        System.out.println("Greatest = " + greatest);
    }

    //TASK-2
    public static void findGreatestAndSmallest(int[] num) {
        int greatest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        for (int n : num) {
            if (n > greatest) {
                greatest = n;
            } else if (n < smallest) {
                smallest = n;
            }
            System.out.println("Smallest = " + smallest);
            System.out.println("Greatest = " + greatest);
        }

    }

    //TASK-3
    public static void findSecondGreatestAndSmallestWithSort(int[] numbers) {
        Arrays.sort(numbers);
        int greatest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        int secondGreatest = Integer.MIN_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < smallest) smallest = number;
        }
        for (int number : numbers) {
            if (number < secondSmallest && number != smallest) secondSmallest = number;
        }
        for (int number : numbers) {
            if (number > greatest) greatest = number;
        }
        for (int number : numbers) {
            if (number > secondGreatest && number != greatest) secondGreatest = number;
        }
        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);
    }


    //TASK-4
    public static void findSecondGreatestAndSmallest(int[] numbers) {
        int greatest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        int secondGreatest = Integer.MIN_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < smallest) smallest = number;
        }
        for (int number : numbers) {
            if (number < secondSmallest && number != smallest) secondSmallest = number;
        }
        for (int number : numbers) {
            if (number > greatest) greatest = number;
        }
        for (int number : numbers) {
            if (number > secondGreatest && number != greatest) secondGreatest = number;
        }
        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);
    }

    //TASK-5
    public static void findDuplicatedElementsInAnArray(String[] strings) {
        String duplicate = "";
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {

                if (strings[i].equals(strings[j]) && !duplicate.contains(strings[i])) {
                    duplicate += strings[i];
                    System.out.println(strings[i]);

                }
            }

        }


    }//TASK-6

    public static void findMostRepeatedElementInAnArray(String[] strings) {
        String mostRepeated = "";
        int counter = 0;
        for (int i = 0; i < strings.length; i++) {
            String repeated = strings[i];
            int count = 0;
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[j].equals(repeated))count++;
            }if (count > counter){
                counter = count;
                mostRepeated = repeated;
            }
        }
        System.out.println(mostRepeated);

    }


}
