package scanner;
import java.util.Scanner;
public class LearningScannerPrimitiveMethods {
    public static void main(String[] args) {

    /*
    How to use Scanner methods
    1. Create an object of Scanner and import the class as well
    ClassName/DataType variableName/objectName = ClassName/DataType(()if they are needed);
    2. variableName/objectName.methodName(()if it is needed);
     */

    /*
    Task-1
    1. Ask user to enter their age
    2. Print the question
    3. Use proper next method (nextInt)
    4. Print out the user's age
     */

        Scanner collect = new Scanner(System.in);

        System.out.println("What is your age? ");
        int userAge = collect.nextInt();
        System.out.println("User's age is "+userAge);

        System.out.println("What is your account balance?");
        double accountBalance = collect.nextDouble();
        System.out.println("user's account balance is "+"\"$"+accountBalance+"\"");

        /*
        Ask user "are you understanding this java class today?"
        Get the answer and store it
        print the answer
         */

        System.out.println("You are understanding this java class today (true/false)?");
        boolean answer = collect.nextBoolean();
        System.out.println("The user is understanding = "+answer);


    }

}
