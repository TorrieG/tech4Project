package mathClass;

import java.util.Scanner;

public class ExerciseMaxAndMin {
    public static void main(String[] args){

        /*
Find the min and max of given 3 numbers, write
down the Pseudo code and print min and max with
proper messages.


NOTE: Declare and Assign all of them in one single line
x = 4, y = 67, z = -54
 */

        int x = 4, y = 67, z = -54;

        Math.max(x,y);//67 first step
        System.out.println("Max of every number is = "+ Math.max(Math.max(x,y),z));//67, -54
        System.out.println("Min of every number is = "+ Math.min(Math.min(x,y),z));//67, -54

        /*
        Write a program which is going to print the max of given 3 numbers
        4,56,23
         */

        System.out.println("What is the max of 4, 56 and 23? = "+
                Math.max(Math.max(4, 56),23));

        /*
        Write a program which is going to ask user 4 numbers
        print the max of 4 retrieved numbers
         */

        Scanner max =new Scanner(System.in);
        System.out.println("Please enter 4 numbers");
        int num1=max.nextInt(), num2=max.nextInt(), num3=max.nextInt(), numb4=max.nextInt();
        System.out.println("The biggest number you entered is = "+Math.max(Math.max(num1,numb4),Math.max(num2,num3)));

        System.out.println("The smallest number you entered is = "+
                Math.min(Math.min(num1,numb4), Math.max(num2,num3)));




    }
}
