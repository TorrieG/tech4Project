package homeworks;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        System.out.println("TASK-1");
        int n1 = (int) (Math.random() * 11), n2 = (int) (Math.random() * 11), n3 = (int) (Math.random() * 11),
                n4 = (int) (Math.random() * 11);
        int i = 1;
//        System.out.println("Number "+i++ +" = " + n1);
        System.out.println("Number 1 = " + n1 +
                "\nNumber 2 = " + n2 +
                "\nNumber 3 = " + n3 +
                "\nNumber 4 = " + n4 +
                "\nAbsolute difference of " + n1 + " with 5 is = " + Math.abs(n1 - 5) +
                "\nAbsolute difference of " + n2 + " with 5 is = " + Math.abs(n2 - 5) +
                "\nAbsolute difference of " + n3 + " with 5 is = " + Math.abs(n3 - 5) +
                "\nAbsolute difference of " + n4 + " with 5 is = " + Math.abs(n4 - 5) +
                "\nGreatest number is = " + Math.max(Math.max(Math.max(n1, n2), n3), n4) +
                "\nSmallest number is = " + Math.min(Math.min(Math.min(n1, n2), n3), n4)
        );

        System.out.println("\nTASK-2");
        int num1 = (int) (Math.random() * 101 - 50), num2 = (int) (Math.random() * 101 - 50),
                num3 = (int) (Math.random() * 101 - 50), num4 = (int) (Math.random() * 101 - 50),
                num5 = (int) (Math.random() * 101 - 50), num6 = (int) (Math.random() * 101 - 50),
                num7 = (int) (Math.random() * 101 - 50), num8 = (int) (Math.random() * 101 - 50);
        System.out.println("Number 1 = " + num1 +
                "\nNumber 2 = " + num2 +
                "\nNumber 3 = " + num3 +
                "\nNumber 4 = " + num4 +
                "\nNumber 5 = " + num5 +
                "\nNumber 6 = " + num6 +
                "\nNumber 7 = " + num7 +
                "\nNumber 8 = " + num8);
        int great = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max
                (Math.max(num1, num2), num3), num4), num5), num6), num7), num8);
        System.out.println("Greatest number is = " + great);
        int small = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min
                (Math.min(num1, num2), num3), num4), num5), num6), num7), num8);
        System.out.println("Smallest number is = " + small);
        System.out.println("Average of 8 numbers is = " +
                (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8) / 8);
        System.out.println("Absolute difference between smallest and greatest is = " + Math.abs(great - small));
//        if (num3 > 0) System.out.println("3rd number is positive = true");
//        else System.out.println("3rd number is positive = false");
        System.out.println("3rd number is positive = "+ (num3>0));
//        if (num5 < 0) System.out.println("5th number is negative = true");
//        else System.out.println("3rd number is negative = false");
        System.out.println("5th number is negative = " + (num5<0));
//        if (num1 == 0 || num2 == 0 || num3 == 0 || num4 == 0 || num5 == 0 || num6 == 0 || num7 == 0 || num8 == 0)
//            System.out.println("There is at least one zero among those numbers is = true");
//        else System.out.println("There is at least one zero among those numbers is = false");
        System.out.println("There is at least one zero among those numbers is = " +
                (num1 == 0 || num2 == 0 || num3 == 0 || num4 == 0 || num5 == 0 || num6 == 0 || num7 == 0 || num8 == 0));

        System.out.println("\nTASK-3");
        Scanner inputSeven = new Scanner(System.in);
        System.out.println("Please enter 7 numbers between 0 and 50 (0 and 50 will be included)");
        int n11 = inputSeven.nextInt(), n12 = inputSeven.nextInt(), n13 = inputSeven.nextInt(),
                n14 = inputSeven.nextInt(), n15 = inputSeven.nextInt(), n16 = inputSeven.nextInt(),
                n17 = inputSeven.nextInt();
        System.out.println("Number 1 = " + n11 +
                "\nNumber 2 = " + n12 +
                "\nNumber 3 = " + n13 +
                "\nNumber 4 = " + n14 +
                "\nNumber 5 = " + n15 +
                "\nNumber 6 = " + n16 +
                "\nNumber 7 = " + n17);
        System.out.println("Greatest number is = " + Math.max(Math.max(Math.max(Math.max(Math.max(Math.max
                (n11, n12), n13), n14), n15), n16), n17));
        System.out.println("Smallest number is = " + Math.min(Math.min(Math.min(Math.min(Math.min(Math.min
                (n11, n12), n13), n14), n15), n16), n17));
        System.out.println("Average of 7 numbers is = " +
                (n11 + n12 + n13 + n14 + n15 + n16 + n17) / 7);
        if (n11 >= 10) System.out.println("First number is greater than or equal to 10 = true");
        else System.out.println("First number is greater than or equal to 10 = false");
        if (n17 <= 40) System.out.println("Last number is less than or equal to 40 = true");
        else System.out.println("Last number is less than or equal to 40 = false");
        if (n11 > 25 && n17 > 25) System.out.println("Both first and last numbers are greater than 25 = true");
        else System.out.println("Both first and last numbers are greater than 25 = false");
        System.out.println("At least one of those numbers is 0 or 50 = true"+
                (n11 == 0 || n11 == 50||n12 == 0 || n12 == 50||n13 == 0 || n13 == 50||n14 == 0 || n14 == 50||n15 == 0
                        || n15 == 50||n16 == 0 || n16 == 50||n17 == 0 || n17 == 50));
        if (n11 >= 40 && n11 <= 50) System.out.println("There is no number between 40 and 50 = false");
        else if (n12 >= 40 && n12 <= 50) System.out.println("There is no number between 40 and 50 = false");
        else if (n13 >= 40 && n13 <= 50) System.out.println("There is no number between 40 and 50 = false");
        else if (n14 >= 40 && n14 <= 50) System.out.println("There is no number between 40 and 50 = false");
        else if (n15 >= 40 && n15 <= 50) System.out.println("There is no number between 40 and 50 = false");
        else if (n16 >= 40 && n16 <= 50) System.out.println("There is no number between 40 and 50 = false");
        else if (n17 >= 40 && n17 <= 50) System.out.println("There is no number between 40 and 50 = false");
        else System.out.println("There is no number between 40 and 50 = true");

        System.out.println("\nTASK-4");
        int n31 = (int) (Math.random() * 101), n32 = (int) (Math.random() * 101), n33 = (int) (Math.random() * 101);
        System.out.println(n31 + "\n" + n32 + "\n" + 33);
        if (n31 > 25 && n32 > 25 && n33 > 25) System.out.println("true");
        else System.out.println("false");

        System.out.println("\nTASK-5");
        Scanner inputFive = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 7");
        int day = inputFive.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You have entered an incorrect number");

        }

        System.out.println("\nTASK-6");
        Scanner inputSix = new Scanner(System.in);
        System.out.println("Please enter a number between -10 and 10");
        int n61 = inputSix.nextInt();
        if (n61 > 0) {
            System.out.println("Number entered is POSITIVE");
        } else if (n61 < 0) {
            System.out.println("Number entered is NEGATIVE");
        } else {
            System.out.println("Number entered is ZERO");
        }
        if (n61 % 2 == 0) {
            System.out.println("Number entered is EVEN");
        } else {
            System.out.println("Number entered is ODD");
        }

        System.out.println("\nTASK-7");
        Scanner inputTaskSeven = new Scanner(System.in);
        System.out.println("Please enter your 3 exam results");
        int n71 = inputTaskSeven.nextInt(), n72 = inputTaskSeven.nextInt(), n73 = inputTaskSeven.nextInt();
        if ((n71 + n72 + n73) / 3 >= 70) System.out.println("YOU PASSED!");
        else System.out.println("YOU FAILED!");

        System.out.println("\nTASK-8");
        Scanner inputEight = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        int n81 = inputEight.nextInt(), n82 = inputEight.nextInt(), n83 = inputEight.nextInt();
        if (n81 == n82 && n82 == n83) System.out.println("TRIPLE MATCH");
        else if (n81 == n82 || n81 == n83 || n82 == n83) System.out.println("DOUBLE MATCH");
        else System.out.println("NO MATCH");


    }
}
