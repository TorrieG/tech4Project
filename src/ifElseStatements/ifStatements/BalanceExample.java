package ifElseStatements.ifStatements;

import java.util.Scanner;

public class BalanceExample {
    public static void main(String[] args) {

        double balance = 150;
        boolean isBalanceLessThan0 = balance< 0;
        boolean isNotEqualTo = balance != -1;
        if(balance< 0){
            System.out.println("Your balance is less than 0");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age?");
        int age =input.nextInt();
        if(age >=55){
            System.out.println("It is your time to get retired!");
        }else{
            System.out.println("You are not gonna retire!");
        }

    }
}
