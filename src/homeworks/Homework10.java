package homeworks;

import utilities.CharacterHelper;
import utilities.StringHelper;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("\n------------TASK-1------------\n");
        String s11 = "JavaScript";
        if (s11.length() <= 1) {
            System.out.println("Length is zero");
        } else {
            System.out.println("Length is = " + s11.length());
            System.out.println("First char is = " + s11.charAt(0));
            System.out.println("Last char is = " + s11.charAt(s11.length() - 1));
            System.out.println(CharacterHelper.isVowel('a') || CharacterHelper.isVowel('e') || CharacterHelper.isVowel('i') ||
                    CharacterHelper.isVowel('o') || CharacterHelper.isVowel('u') ?
                    "This String has vowel" : "This String does not have vowel");

            System.out.println("\n------------TASK-2------------\n");

            String s21 = "toyota";
            System.out.println(s21.length() < 3 ? "Length is less than 3" : StringHelper.getMiddle(s21.trim()));

            System.out.println("\n------------TASK-3------------\n");

            String s31 = "abc  ".trim();
            if (s31.length() < 4) {
                System.out.println("INVALID INPUT");
            } else {
                System.out.println("First 2 characters are = " + s31.trim().substring(0, 2));
                System.out.println("Last 2 characters are = " + s31.trim().substring(s31.length() - 2));
                System.out.println("The other characters are = " + s31.trim().substring(2, s31.length() - 2));
            }
            System.out.println("\n------------TASK-4------------\n");
        /*1. create scanner
          2. ask for a string
          3. assign it to a variable
          4. check if length is less than 2
          5. if so print "Length is less than 2"
          6. otherwise, check if fist and last 2 chars are same and print true or false
        */
            Scanner scan = new Scanner(System.in);
            System.out.println("please input a string");
            String input = scan.nextLine().trim();
            if (input.length() < 2) {
                System.out.println("Length is less than 2");
            } else if (input.substring(0, 2).equals(input.substring(input.length() - 2))) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            System.out.println("\n------------TASK-5------------\n");
            String s51 = "1234", s52 = "green";
            if ((s51.length()) < 2 || (s52.length()) < 2) System.out.println("Invalid input!");
            else System.out.println(s51.substring(1, s51.length() - 1) + s52.substring(1, s52.length() - 1));

            System.out.println("\n------------TASK-6------------\n");
            String w = "xxbluexx";
            if (w.length() < 4) System.out.println("INVALID INPUT");
            else if (w.startsWith("xx") && w.endsWith("xx")) {
                System.out.println("true");
            } else System.out.println("false");


        }
    }
}
