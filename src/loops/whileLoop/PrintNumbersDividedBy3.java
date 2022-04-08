package loops.whileLoop;

public class PrintNumbersDividedBy3 {
    public static void main(String[] args) {
/*
        Write a Java program to check numbers from 1 to 30 (30 is included)
        and print all the numbers that can be divided by 3
        NOTE: Use while loop
        Expected output:
        3
        6
        9
        .
        .
        .
        24
        27
        30

        startPoint  : 1
        endPoint    : 30
        update      : ++ increment
         */

        int i = 1;
        while(i <= 30){
            if (i % 3 == 0) System.out.println(i);
            i++;
        }
    }
}
