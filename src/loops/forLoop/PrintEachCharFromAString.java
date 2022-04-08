package loops.forLoop;

public class PrintEachCharFromAString {
    public static void main(String[] args) {
        /*
        Write a Java program to ask user to enter a number and print all the odd numbers starting from 0 to given number by user (0 and given number is included)

Test data:
15

Expected output:
1
3
5
.
.
.
13
15

         */

        String str = "TechGlobal School";
        for(int i = 0; i <= str.length()-1; i++){
            System.out.println(str.charAt(i));
        }
    }
}
