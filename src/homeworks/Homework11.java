package homeworks;

import utilities.CharacterHelper;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

        System.out.println("\n------------TASK-1------------\n");
        String a1 = "";
        for (int i = 1; i <= 100; i++){
            if (i % 7 == 0) a1 += i + " - ";
        }
        System.out.println(a1.substring(0, a1.length()-3));

        System.out.println("\n------------TASK-2------------\n");
        String b1 = "";
        for (int i = 1; i <= 50; i++){
            if (i % 6 == 0) b1 += i + " - ";
        }
        System.out.println(b1.substring(0,b1.length()-3));

        System.out.println("\n------------TASK-3------------\n");
        String c1 = "";
        for (int i = 100; i >= 50; i--){
            if (i % 5 == 0) c1 += i + " - ";
        }
        System.out.println(c1.substring(0,c1.length()-3));

        System.out.println("\n------------TASK-4------------\n");
        for (int i = 0; i <= 7; i++){
            System.out.println("The square of " + i + " is = " + (i * i));
        }
        System.out.println("\n------------TASK-5------------\n");
        int sum5 = 0;
        for (int i = 1; i <= 10; i++){
            sum5 += i;
        }
        System.out.println(sum5);

        System.out.println("\n------------TASK-6------------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int user = input.nextInt();
        int sum6 = 1;
        int fact = 1;
        while (fact <= user){
            sum6 *= fact;
            ++fact;
        }
        System.out.println(sum6);


        System.out.println("\n------------TASK-7------------\n");
        /*
        1. Ask user to "Please enter your full name"
        2. Store the String
        3. Create a container to count vowels
        4. Check to see if the String contains a vowel
        5. Add them to the container and repeat until end of String
        6. Print how many vowels are in the full name
         */
        //input.nextLine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name");
        //String full = input.nextLine().toLowerCase();
        String full = scanner.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i <= full.length()-1; i++){
            if (CharacterHelper.isVowel(full.charAt(i))) {
                count ++;
            }
        }
        System.out.println("There are " + count + " vowel letters in this full name");

        System.out.println("\n------------TASK-8------------\n");
        /*
        1. Create a do while loop
        2. Get number from user with scanner add them to sum
           - and if they are more than or equal to 100 "Sum of the entered numbers is at least 100"
        3. If the number is more than or equal to 100 AND we are at the FIRST run BREAK;
        4. Create a container for counter, sum and users number


         */

        int n8;
        int sum8 = 0;
        System.out.println("Please enter a number");
        n8 = input.nextInt();
        if (n8 >= 100 && sum8 == 0){
            System.out.println("This number is already more than 100");
        }else{
            while (sum8 <= 100){
                sum8 += n8;
                if (sum8 >= 100) break;
                System.out.println("Please enter a number");
                n8 = input.nextInt();

            }
            System.out.println("Sum of the entered numbers is at least 100");
        }
        System.out.println("\n------------TASK-9------------\n");
        /*
        0 1 -> 1
        1 1 -> 2
        1 2 -> 3
        2 3 -> 5
        a = 0
        b = 1
        a + b = c
        a = b
        b = c
         */

        int a = 0;
        int b = 1;
        int c = a + b;
        String message = "0 - ";

        System.out.println("Enter a number");
        int num = input.nextInt();
        for (int i = 0; i < num-1; i++) {
            message += c + " - ";
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(message.substring(0,message.length()-3));

        System.out.println("\n------------TASK-10------------\n");
        String name10;
        do {
            System.out.println("Please enter a name");
            name10 = scanner.nextLine().toUpperCase();
        }while (name10.charAt(0) != 'J');
        System.out.println("End of the program");

    }
}
