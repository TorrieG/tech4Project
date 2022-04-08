package utilities;

import java.util.Scanner;

public class ScannerHelper {

    public static int getNumberFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
    public static String getANameFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = scanner.nextLine();
        return name;
    }
    public static String getAStringFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = scanner.nextLine();
        return string;
    }
    public static String getFavoriteBookFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your favorite book: ");
        String book = scanner.nextLine();
        return book;
    }
    public static String getFavoriteQuoteFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your favorite quote: ");
        String quote = scanner.nextLine();
        return quote;
    }
    public static String getASentenceFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a senetence: ");
        String sentence = scanner.nextLine();
        return sentence;
    }
    public static String getAnAddressFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an address: ");
        String address = scanner.nextLine();
        return address;
    }
    public static String get4ColorsFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 4 colors: ");
        String colors = scanner.nextLine();
        return colors;
    }

}
