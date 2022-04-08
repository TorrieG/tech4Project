package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class Between0And100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Write a program asks user to put number and checks if the number
        is between 0 and 100

        Math.random() * (big - small + 1) + start point

        if it is true print out "It is in between 0 and 100"

        else "it is not in between 0 and 100"
         */

        System.out.println("Please enter a number");
        int num = scan.nextInt();
        if (num >= 0 && num <= 100) {
            System.out.println("It is in between 0 and 100");
        } else {
            System.out.println("it is not in between 0 and 100");
        }
    }
}
