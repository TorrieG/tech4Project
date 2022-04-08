package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class FindTheSmallestOf2Numbers {
    public static void main(String[] args) {
        /*
        write a program that asks user to enter 2 numbers
        find the smallest and print it

        EXAMPLE PROGRAM:
Program: Please enter 2 numbers
User: 5 7

Program: 5
 */




        Scanner inputData = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1 = inputData.nextInt(),  num2 =inputData.nextInt();


        //2nd way using simple if else
        /* if (num1 < num2) System.out.println(num1);
        else System.out.println(num2);
        //3rd way using ternary operator
        /*
        Ternary Operator
        variable variableName = condition ? option1 : option2;
         */
        int smallestNumber = num1 < num2 ? num1 : num2;
        System.out.println(smallestNumber);

        // OR --> System.out.println(num1 < num2 ? num1 : num2);
    }
}
