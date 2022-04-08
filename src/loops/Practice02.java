package loops;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {


        /*
        1. create a scanner
        2. ask user for 2 number 0-10
        3. store them
        4. find max and min
        5. increment min to max not including #5
         */

        System.out.println("\n----------With-Continue----------\n");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a = scan.nextInt(), b = scan.nextInt();
        for (int i = Math.min(a,b); i <= Math.max(a,b); i++) {
            if(i == 5) continue;
            System.out.println(i);

        }
        System.out.println("\n----------Without-Continue----------\n");
        for (int i = Math.min(a,b); i <= Math.max(a,b); i++) {
            if(i != 5) System.out.println(i);
        }
    }
}
