package loops;

public class UnderstandingLoops {
    public static void main(String[] args) {

        /*
        Write a Java program to print "Hello" 5 times

        used to repeat code infinitely

        it is a statement

        Iteration --> each loop
         */


        /*
        SYNTAX:
        for(initialization; termination condition; change or update){     //this is your condition
               //Block of code to execute
        }
         for(int count = 10; count <= 1; count++){  //infinite loop
            System.out.println("Hello");
        }

        for(int count = 10; count <= 1; count--){  //infinite loop has no termination point
            System.out.println("Hello");

         */
        int year = 2022;

        for(int i = 45; i <= 100; i++){
            System.out.println("The guys age is now = "+i);
        }


        System.out.println("End of the program!");


    }
}
