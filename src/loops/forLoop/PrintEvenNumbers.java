package loops.forLoop;

import utilities.MathHelper;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        /*
        Even numbers 0 to 10

        Decide:
            start point : 0
            end point   : 10
            update      : increment
         */


        System.out.println("\n-------1st-way--------\n");
        for(int i = 0; i <= 10; i++){
            if(i % 2 == 0) System.out.println(i);
        }


        System.out.println("\n-------2nd-way--------\n");
        for(int i = 0; i <= 10; i++){
            if(MathHelper.isEven(i)) System.out.println(i);
        }


        System.out.println("\n-------3rd-way--------\n");
        for(int i = 0; i <= 10; i += 2){ // be careful with start point
            System.out.println(i);
        }


        System.out.println("\n-------4th-way--------\n");
        for(int i = 0; i <= 10; i++){
            System.out.println(i++);
        }
    }
}
