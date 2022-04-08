package recaps;

import java.util.Scanner;

public class Homeworks10And11 {
    public static void main(String[] args) {

        System.out.println("\n------------TASK-8------------\n");
        /*
        1. Create a do while loop
        2. Get number from user with scanner add them to sum
           - and if they are more than or equal to 100 "Sum of the entered numbers is at least 100"
        3. If the number is more than or equal to 100 AND we are at the FIRST run BREAK;
        4. Create a container for counter, sum and users number


         */

        Scanner scanner = new Scanner(System.in);
        int num = 0; // for getting a number from user
        int sum = 0; // for getting the SUM of given NUMBERS
        int attempt = 1; // for checking how many TIMES this Loop has run
        do {
            System.out.println("Please enter a number");
            num = scanner.nextInt();
            if (attempt == 1 && num >= 100) {
                System.out.println("This number is already more than 100")
                ;
                break;
            } else {
                sum += num;
                if (sum >= 100) {
                    System.out.println("Sum of the entered numbers is at least 100");
                }
            }

            attempt++; // this updates how many TIMES we ran the loop and will prevent program from entering the do{ if()}

        } while (sum < 100);

        System.out.println("\n------------TASK-9------------\n");

        /*
        1. Two containers for 0, 1 and then another one for the sum, and String for message
        2. Create a fori loop runs 'n' times
        3. print out the series
         */

        int a = 0;
        int b = 1;
        int c = 0;
        String message = "";
        /*
                a   b   c
        i = 0|  0   1   1
        i = 1|  1   1   2
        i = 2|  1   2   3
        i = 3|  2   3   5
        ...
        ...
        0, 1, 1, 2, 3, 5,
         */

        for (int i = 0; i < 7; i++) {
            message += a + " - ";
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(message.substring(0, message.length() - 3));

    }
}
