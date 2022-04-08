package scanner;

import java.util.Scanner;

public class SolvingScannerNextLineProblem {

    public static void main(String[] args){

        /*
        name        -->next()
        age         -->next()
        fav quote   -->nextLine()
         */

        Scanner userInput = new Scanner(System.in);
     System.out.println("Whats your name?");
        String name = userInput.next();

    System.out.println("Whats your age?");
    userInput.nextLine();
       int age = userInput.nextInt();

        System.out.println("Your brain is fried (true/false)?");
       userInput.nextLine();
      boolean brain = userInput.nextBoolean();

      System.out.println("Whats your address?");
       userInput.nextLine();
      String address = userInput.nextLine();

        /*
        Write a Java program that asks user to enter
        3 numbers and print the sum of those 3 numbers
         */

        /*
        pseudo code
         */
        Scanner userOutput = new Scanner(System.in);
        System.out.println("Give a number 1");
        int num1 = userOutput .nextInt();

        System.out.println("Give a number 2");
        int num2 = userOutput .nextInt();

        System.out.println("Give a number 3");
        int num3 = userOutput .nextInt();

        System.out.println("Sum of the numbers is ="+(num1+num2+num3));







    }
}
