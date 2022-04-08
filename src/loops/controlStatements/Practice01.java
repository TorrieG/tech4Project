package loops.controlStatements;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        /*
        create a scanner
        ask user for 2 numbers
        store numbers in int variables
        get the min and max
        print numbers from max to min


         */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a = scan.nextInt(), b = scan.nextInt();
        for (int i = Math.max(a,b); i >= Math.min(a,b); i--) {
            if (i < 10) break;
            System.out.println(i);



        }

    }
}
