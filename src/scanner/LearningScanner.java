package scanner;

import java.util.Scanner;  //1. this is how you import the scanner
public class LearningScanner {
    public static void main(String[] args){

        /*
        1. I'm going to use Scanner class for creating my object
        2. I will use the object for reading the data.
        (pseudocode is recommended)
         */

        Scanner scanner = new Scanner(System.in);  //2. this is how to create a scanner object to use methods

        System.out.println("Please put your first name"); //3. this is what I want the user to do
        String firstName = scanner.next(); //4. storing the first name from the user

        System.out.println("Please put your last name");
        String lastName = scanner.next();

        System.out.println("First Name = " + firstName); //printing the object/variable
        System.out.println("Last Name = " + lastName); //printing the object/variable


    }
}
