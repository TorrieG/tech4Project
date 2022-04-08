package exercises;

import java.util.Scanner;

public class IfElseSwitchPractice {
    public static void main(String[] args) {

            /*
            write a code asks a user age and
            if the user is 16 or older print out "You can drive"
            if the user is 18 or older print out "You can work"
            if the user is 21 or older print out "You can drink"
            if the user us 25 or older print out "You can rent a car"
             */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int a = input.nextInt();

        if (a > 15) {
            System.out.println("You can drive");
            if (a > 17) {
                System.out.println("You can work");
                if (a >= 21) {
                    System.out.println("you can drink");
                    if (a >= 25) {
                        System.out.println("You can rent a car");
                    }
                }
            }
        }
    }
}
