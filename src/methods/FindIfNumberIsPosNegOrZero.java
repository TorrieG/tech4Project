package methods;

import utilities.MathHelper;
import utilities.ScannerHelper;

public class FindIfNumberIsPosNegOrZero {
    public static void main(String[] args) {

        /*
          Ask user to enter an any number
-Print "The number is positive" if the user enters a positive number
-Print "The number is negative" if the user enters a negative number
-Print "The number is zero" if the user enters zero
         */

        int n = ScannerHelper.getNumberFromUser();

        if (MathHelper.isPositive(n)){
            System.out.println("The number is positive");
        }
        else if (MathHelper.isNegative(n)){
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is zero");
        }
    }
}
