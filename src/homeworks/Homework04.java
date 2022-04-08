package homeworks;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("TASK-1");
        System.out.println("Please enter two numbers.");
//        int number1 = data.nextInt(), number2 = data.nextInt();
//        System.out.println("The average of the 2 given numbers is: "+(number1+number2)/2);
        System.out.println("The average of the 2 given numbers is: " + (data.nextInt() + data.nextInt()) / 2);//less code

        System.out.println("\nTASK-2");
        System.out.println("Please enter 2 numbers.");
        int number3 = data.nextInt(), number4 = data.nextInt();
        System.out.println("The product of the 2 given numbers is: " + (number3 * number4));

        System.out.println("\nTASK-3");
        System.out.println("Please enter 3 numbers.");
        int mySquare1 = data.nextInt(), mySquare2 = data.nextInt(), mySquare3 = data.nextInt();
        System.out.println("The " + mySquare1 + " multiplied with " + mySquare1 + " is = " + (mySquare1 * mySquare1) +
                "\nThe " + mySquare2 + " multiplied with " + mySquare2 + " is = " + (mySquare2 * mySquare2) +
                "\nThe " + mySquare3 + " multiplied with " + mySquare3 + " is = " + (mySquare3 * mySquare3)
        );

        System.out.println("\nTASK-4");
        System.out.println("Please enter 2 numbers.");
        int myRemainder = data.nextInt(), mySecondRemainder = data.nextInt();
        System.out.println("The remainder of " + myRemainder + " / " + mySecondRemainder + " = " + (myRemainder % mySecondRemainder));

        System.out.println("\nTASK-5");
        System.out.println("Please enter 5 numbers.");
        int avg1 = data.nextInt(), avg2 = data.nextInt(), avg3 = data.nextInt(), avg4 = data.nextInt(), avg5 = data.nextInt();
        System.out.println("The average of the 5 given numbers is: " + ((avg1 + avg2 + avg3 + avg4 + avg5) / 5));

        System.out.println("\nTASK-6");
        System.out.println("Please enter a number");
        int timesTable = data.nextInt();
        int num = 1;
//        System.out.println(timesTable+" *  = "+(timesTable)+
//                "\n"+timesTable+" * 1 = "+(timesTable*2)+
//                "\n"+timesTable+" * 1 = "+(timesTable*3)+
//                "\n"+timesTable+" * 1 = "+(timesTable*4)+
//                "\n"+timesTable+" * 1 = "+(timesTable*5)+
//                "\n"+timesTable+" * 1 = "+(timesTable*6)+
//                "\n"+timesTable+" * 1 = "+(timesTable*7)+
//                "\n"+timesTable+" * 1 = "+(timesTable*8)+
//                "\n"+timesTable+" * 1 = "+(timesTable*9)+
//                "\n"+timesTable+" * 1 = "+(timesTable*10)+

        System.out.println(+timesTable + " * " + num + " = " + (timesTable * num++));
        System.out.println(+timesTable + " * " + num + " = " + (timesTable * num++));
        System.out.println(+timesTable + " * " + num + " = " + (timesTable * num++));
        System.out.println(+timesTable + " * " + num + " = " + (timesTable * num++));
        System.out.println(+timesTable + " * " + num + " = " + (timesTable * num++));
        System.out.println(+timesTable + " * " + num + " = " + (timesTable * num++));
        System.out.println(+timesTable + " * " + num + " = " + (timesTable * num++));
        System.out.println(+timesTable + " * " + num + " = " + (timesTable * num++));
        System.out.println(+timesTable + " * " + num + " = " + (timesTable * num++));
        System.out.println(+timesTable + " * " + num + " = " + (timesTable * num));

        System.out.println("\nTASK-7");
        System.out.println("Please enter the side value of a square");
        int side = data.nextInt();
        System.out.println("Perimeter of the square = " + (side * 4) +
                "\nArea of the square = " + (side * side)
        );

    }
}
