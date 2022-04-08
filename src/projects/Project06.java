package projects;

import java.util.Scanner;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("\nTASK - 1");

        /*
        Create a counter to hold the space count
        Create a scanner to get data from user and trim
        Create a fori loop to count spaces
        Check if the sentence has at least 2 words
        Increment count
        Print appropriate messages
         */

        int count = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String a = scanner.nextLine().trim();

        for (int i = 0; i < a.length(); i++) {
            if (!a.contains(" ")) {
                System.out.println("This sentence does not have multiple words.");
                break;
            } else if (a.charAt(i) == ' ') {
                count++;
                if (count > 1) System.out.println("This sentence has " + count + " words.");
            }

        }
        System.out.println("\nTASK - 2");
        /*
        1. Ask user to enter a word
        2. store it
        3. create 2 containers to store letters
        4. check if the word has 1 or more characters
        6. increment first container decrement second
        7. print the statements
         */

        String forward = "";
        String backwards = "";

        System.out.println("Enter a word");
        String word = scanner.nextLine();
        int mid = word.length() / 2;
        if (word.length() < 1) {
            System.out.println("This word does not have 1 or more characters");
        } else {
            for (int i = 0; i < word.length(); i++) {
                forward += word.charAt(i);
            }
            for (int i = word.length() - 1; i >= 0; i--) {
                backwards += word.charAt(i);
            }
            System.out.println(forward.equals(backwards) ? "This word is palindrome" : "This word is not palindrome");
        }


        System.out.println("\nTASK - 3");

        /*
        1. ask user to enter a sentence
        2. store it and change it to uppercase
        3. create a container to store the 'A' count
        4. increment the count
        5. print the message
         */

        count = 0;
        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine().toUpperCase();
        if (!sentence.isEmpty()) {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == 'A') {
                    count++;
                }
            }
            System.out.println("This sentence has " + count + " a or A letters.");
        } else {
            System.out.println("This sentence does not have any characters");


        }
        System.out.println("\nTASK - 4");
        /*
        1. ask user to enter a positive number
        2. check if it is divisible by 6 then 2 & 3
        3. print all numbers replacing with appropriate words
         */

        System.out.println("Enter a positive number");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 6 == 0){
                System.out.println("FooBar");
            }else if (i % 3 == 0){
                System.out.println("Bar");
            }else if (i % 2 == 0){
                System.out.println("Foo");
            }else System.out.println(i);

        }

    }
}
