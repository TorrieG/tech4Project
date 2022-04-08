package scanner;

import java.util.Scanner;

public class ScannerEmptySpaceTest {
    public static void main(String[] args){
        Scanner scannerName = new Scanner(System.in);
        System.out.println("What is your full address?");

        String fullAddress = scannerName.nextLine(); //now it can take the rest of the sentence
        System.out.println("What is your age?");
        int age = scannerName.nextInt();
        scannerName.nextLine(); //takes the empty space
        System.out.println("What is your telephone number");
        String number = scannerName.nextLine();
        System.out.println("This is a test");
        String test = scannerName.nextLine();
        System.out.println("Your address is = " + fullAddress);
        System.out.println("Your age is = "+age);



    }
}
