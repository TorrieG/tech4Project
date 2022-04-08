package operators.shortHandAssignmentOperators;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        /*

         */
        Scanner input = new Scanner(System.in);

        System.out.println("What is your balance");
        double balance = input.nextDouble();

        System.out.println("What is your 1st transaction");
        double first =input.nextDouble();
        balance-=first;

        System.out.println("New balance = $"+balance);

        System.out.println("What is your 2nd transaction");
        double second =input.nextDouble();
        balance-=second;

        System.out.println("New balance = $"+balance);

        System.out.println("What is your 3rd transaction");
        double third = input.nextDouble();
        balance-=third;

        System.out.println("New balance = $"+(balance));






    }
}
