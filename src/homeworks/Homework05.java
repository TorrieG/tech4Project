package homeworks;

import utilities.RandomNumberGenerator;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {

        Scanner mathClass=new Scanner(System.in);
        System.out.println("TASK-1");
        System.out.println("Please enter 3 numbers.");
        int numb1 = mathClass.nextInt(), numb2 = mathClass.nextInt(), numb3 = mathClass.nextInt();
        System.out.println("Max value = "+(Math.max(Math.max(numb1,numb2), numb3))+
                "\nMin value = "+ (Math.min(Math.min(numb1,numb2),numb3)));

//        System.out.println("Max value = "+(Math.max(Math.max(mathClass.nextInt(),mathClass.nextInt()), mathClass.nextInt()))+
//                "\nMin value = "+ (Math.min(Math.min(mathClass.nextInt(),mathClass.nextInt()),mathClass.nextInt())));

        System.out.println();
        System.out.println("\nTASK-2");
        System.out.println("Please enter 5 numbers.");
        int secondTask1 = mathClass.nextInt(), secondTask2 = mathClass.nextInt(), secondTask3 = mathClass.nextInt(),
        secondTask4 = mathClass.nextInt(), secondTask5 = mathClass.nextInt();
        System.out.println("Max value = "+(Math.max(secondTask1,Math.max(Math.max(secondTask2,secondTask3),Math.max(secondTask4,secondTask5)))));
        //int maxOf5 = Math.max(n1, Math.max(Math.max(n2, n3), Math.max(n4, n5)));
        System.out.println("Min value = "+(Math.min(secondTask1,Math.min(Math.max(secondTask2,secondTask3),Math.min(secondTask4,secondTask5)))));

        System.out.println("\nTASK-3");
        Scanner absolute = new Scanner(System.in);
        System.out.println("Please enter 2 numbers.");
        System.out.println("The difference between numbers is = "+
                ((Math.abs(absolute.nextInt()-absolute.nextInt()))));

        System.out.println("\nTASK-4");
        //random * (end point - start point + 1) + start point
        int random1 = (int)(Math.random() *51+50), random2 = (int)(Math.random() *51+50),
                random3 = (int)(Math.random() *51+50);
        System.out.println("Number 1 = "+random1+
                "\nNumber 2 = "+random2+
                "\nNumber 3 = "+random3+
                "\nThe sum of numbers is = "+(random1+random2+random3)
        );

        System.out.println("\n---------TASK-4 April-15 2.5 months in--------\n");

        /** I have forgotten how to do this lol */
        /*
        Requirement:
        -Write a Java program that generates 3 random numbers between 50 and 100 both included. Use Math.random()
        First print the numbers
        Then, find the sum of these numbers

        Test Data:
        67
        90
        Expected Output:
        Number 1 = 55
        Number 2 = 67
        Number 3 = 90
        The sum of numbers is = 212
         */
        int n1 = (int) (Math.random()*51+50), n2 = (int)(Math.random()*51+50), n3 = (int)(Math.random()*51+50);

        System.out.println("Number 1 = "+n1);
        System.out.println("Number 2 = "+n2);
        System.out.println("Number 3 = "+n3);

        System.out.println("The sum of numbers is = "+ (n1+n2+n3));



        System.out.println("\nTASK-5");
        double alex = 125, mike = 220;
        System.out.println("Alex's money: $"+(alex-25.5)+
                "\nMike's money: $"+(mike+25.5));

        System.out.println("\nTASK-6");
        double daily = 15.6, goal = 390;
        System.out.println((int)(goal/daily));




    }
}
