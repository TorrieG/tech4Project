package homeworks;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("\nTASK-1");
        int t11 = (int) (Math.random() * 101 - 50);
        System.out.println("The number " +t11+" is between 10 and 25 = "+(t11>10 && t11<25));

        //
        System.out.println((t11 >= 10 && t11 <= 25)
                ? t11+" is in between 10 and 25(included)"
                : t11+" is NOT in between 10 and 25(included)");

        System.out.println("\nTASK-2");
        int t21 = (int) (Math.random()*100-1);
        if (t21<51) System.out.println(t21 + " is in the 1st half");
        else System.out.println(t21+" is in the 2nd half");
        if (t21<26) System.out.println(t21 +" is in the 1st quarter");
        else if (t21<51)System.out.println(t21 +" is in the 2nd quarter");
        else if (t21<76)System.out.println(t21 +" is in the 3rd quarter");
        else System.out.println(t21 +" is in the 4th quarter");

        System.out.println("\nTASK-3");
        Scanner inputData = new Scanner(System.in);
        int t31 =inputData.nextInt(), t32 =inputData.nextInt(), t34 =inputData.nextInt(),
                t33=inputData.nextInt(), t35 =inputData.nextInt();
        System.out.println("Please enter 5 numbers between 1 to 10");
       System.out.println(inputData.nextInt()*5+inputData.nextInt()*4+inputData.nextInt()*3+
               inputData.nextInt()*2+inputData.nextInt());


    }
}
