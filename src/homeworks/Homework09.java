package homeworks;

import utilities.ScannerHelper;

public class Homework09 {
    public static void main(String[] args) {
        System.out.println("TASK-1\n");
        String name1 = ScannerHelper.getANameFromUser();
        System.out.println("The length of the name is = " + name1.length());
        System.out.println("The first character in the name is = " + name1.charAt(0));
        System.out.println("The last character in the name is = " + name1.charAt(name1.length() - 1));
        System.out.println("The first 3 characters in the name are = " + name1.substring(0, 3));
        System.out.println("The last 3 characters in the name are = " + name1.substring(name1.length() - 3));
        System.out.println(name1.toUpperCase().startsWith("A") ? "You are in the club!" : "Sorry, you are not in the club");

        System.out.println("\nTASK-2\n");
        String address2 = ScannerHelper.getAnAddressFromUser();
        if (address2.toLowerCase().startsWith("chicago")) {
            System.out.println("You are in the club");
        } else if (address2.toLowerCase().startsWith("des plaines")) {
            System.out.println("You are welcome to join to the club");
        } else {
            System.out.println("Sorry, you will never be in the club");

            System.out.println("\nTASK-3\n");
            String colors = ScannerHelper.get4ColorsFromUser();
            if (colors.toUpperCase().contains("RED") && colors.toLowerCase().contains("green")) {
                System.out.println("Green and red are in the list");
            } else if (colors.toLowerCase().contains("green")) {
                System.out.println("Green is in the list");
            } else if (colors.toUpperCase().contains("RED")) {
                System.out.println("Red is in the list");
            } else {
                System.out.println("Green and red are not in the list");
            }

            System.out.println("\nTASK-4\n");
            String str = "   Java is FUN   ";
            System.out.println("The first word in the str is = " + str.trim().toLowerCase().substring(0, 4));
            System.out.println("The second word in the str is = " + str.toLowerCase().trim().substring(5, 7));
            System.out.println("The third word in the str is = " + str.toLowerCase().trim().substring(8));


        }

    }
}

