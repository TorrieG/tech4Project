package scanner;

import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args){

        /*
        Write a Java program that reads firstName and lastName from user
         and print those as full name in 1 statement

         use the . after the object and before the ()
         */


        Scanner exerciseOne = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = exerciseOne.next();
       // System.out.println("Your first name is "+firstName);

        System.out.println("What is your last name?");
        String lastName = exerciseOne.next();
        //System.out.println("Your last name is "+lastName);

        System.out.println("The users first and last name is "+firstName + " " +lastName);
        /*
        Write a Java program that reads the full address from user and print the address
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your full address?");
        exerciseOne.nextLine(); //takes the empty space
        String fullAddress = scanner.nextLine(); //now it can take the rest of the sentence
        System.out.println("Your address is = " + fullAddress);


    }
}
