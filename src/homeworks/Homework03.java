package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("TASK-1");
        System.out.println("Please enter your first number");
        int number1 = input.nextInt();
        System.out.println("Please enter your second number");
        int number2 =input.nextInt();
        System.out.println("The number 1 entered by user is = "+number1);
        System.out.println("The number 2 entered by user is = "+number2);
        System.out.println("The sum of number 1 and 2 entered by user is ="+(number1+number2));

        System.out.println("\nTASK-2");
        System.out.println("Please enter a floating number");
        double num1 = input.nextDouble();
        System.out.println("Please enter another floating number");
        double num2 = input.nextDouble();
        System.out.println("The number 1 entered by user is = "+num1);
        System.out.println("The number 2 entered by user is = "+num2);
        System.out.println("The quotient of the number 1 and 2 entered by use is = "+(num1/num2));

        System.out.println("\nTASK-3");
        System.out.println(-10+7*5);
        System.out.println((72+24)%24);
        System.out.println(10+-3*9/9);
        System.out.println(5+18/3*3-(6%3)); //(5 + 18 / 3 * 3) suggested by IntelliJ

        System.out.println("\nTASK-4");
        System.out.println("Please enter a floating number");
        double firstNum = input.nextDouble();
        System.out.println("Please enter another floating number");
        double secondNum = input.nextDouble();
        System.out.println("The sum of the given numbers is = "+(firstNum+secondNum));
        System.out.println("The product of the given numbers is = "+(firstNum*secondNum));
        System.out.println("The difference of the given numbers is = "+(firstNum-secondNum));
        System.out.println("The quotient of the given numbers is = "+(firstNum/secondNum));
        System.out.println("The remainder of the given numbers is = "+(firstNum%secondNum));

        System.out.println("\nTASK-5");
        double width = 7.5, height = 10.5;
        System.out.println("The area of the rectangle = "+(width*height));
        System.out.println("The perimeter of the rectangle = "+(2*(width+height)));

        System.out.println("\nTASK-6");
        double annualSalary=90000;
        int years=3;
        System.out.println("A Software Engineer in Test can earn "+(annualSalary*years)+" in "+years+" years.");






    }
}
