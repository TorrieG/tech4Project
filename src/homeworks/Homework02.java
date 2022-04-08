package homeworks;

import java.util.Scanner;

public class Homework02 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //TASK-1
        System.out.println("What is your first name?");
        String firstName = input.nextLine();

        System.out.println("What is your last name?");
        String lastName = input.nextLine();

        System.out.println("What is your age?");
        int age = input.nextInt();

        System.out.println("What is your email address?");
        input.nextLine();
        String emailAddress = input.nextLine();

        System.out.println("What is your phone number? Please use (xxx) xxx xxx format.");
        String phoneNumber = input.nextLine();

        System.out.println("What is your address?");
        String address = input.nextLine();

        System.out.println("\tUser who joined this program is "+firstName+" "+lastName+". "+firstName+"\'s"+" age is "
        +age+". "+firstName+"\'s email\naddress is "+emailAddress+", "+"phone number "+phoneNumber+", "+"and address is "
                +"\n"+address+".");

        //TASK-2
        System.out.println("\nWhat is your favorite book?");
        String favBook = input.nextLine();

        System.out.println("What is your favorite color?");
        String favColor = input.nextLine();

        System.out.println("What is your favorite number?");
        int favNumber = input.nextInt();

        System.out.println("User's favorite book is: "+favBook+"\nUser's favorite color is: "+favColor+"\nUser's " +
                "favorite number is: "+favNumber);




    }

}
