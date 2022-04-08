package loops.doWhileLoop;

import utilities.ScannerHelper;

import java.util.Scanner;

public class AskUser10 {

    public static void main(String[] args) {

        /*
        Write a Java program that asks user to enter a number
if number is more than or equal to 10, then finish the program but if number is less than 10, keep asking user to enter a new number until user enters a number that is more than or equal to 10

Example program
Program: Please enter a number
User: 3
Program: This number is not more than or equal to 10

Program: Please enter a new number
User: 8
Program: This number is not more than or equal to 10

Program: Please enter a new number
User: 15
Program: This number is more than or equal to 10

         */

        System.out.println("------------While-Loop-----------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();
        while (num < 10){
            System.out.println("This number is not more than or equal to 10");
            System.out.println("Please enter a new number");
            num = scanner.nextInt();
        }
        System.out.println("This number is more than or equal to 10");

        System.out.println("------------Do-While-Loop------------");

        int number;

        do{
            System.out.println("Please enter a number");
            number = scanner.nextInt();
        }while (number < 10);
        System.out.println("This number is more than or equal to 10");
    }

}
