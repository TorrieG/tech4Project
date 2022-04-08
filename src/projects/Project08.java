package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project08 {

    //TASK-1
    public static int countMultipleWords(String[] strings) {
        int a = 0;
        for (String string : strings) {
            if (string.trim().contains(" "))
                a++;
        }
        return a;
    }

    //TASK-2
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbs) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (Integer element : numbs) {
            if (element >= 0) numbers.add(element);
        }
        return numbers;
    }

    //TASK-3
    public static boolean validatePassword(String password) {
        int upper = 0, lower = 0, digit = 0, special = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.length() >= 8 && password.length() <= 16 && !password.contains(" ")) {
                if (Character.isUpperCase(password.charAt(i))) upper++;
                if (Character.isLowerCase(password.charAt(i))) lower++;
                if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))) special++;
                if (Character.isDigit(password.charAt(i))) digit++;
            }
        }
        return (upper > 0 && lower > 0 && digit > 0 && special > 0);
    }

    //TASK-4
    public static boolean validateEmailAddress(String email) {
        int a = 0;
        if (!email.contains(" ") && email.indexOf('@') < email.indexOf('.')) {
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') a++;
            }
        }
        return (a == 1 && email.substring(0, (email.indexOf('@'))).length() >= 2 &&
                email.substring(email.indexOf('@') + 1, email.indexOf('.')).length() >= 2 &&
                email.substring(email.lastIndexOf('.') + 1).length() >= 2);
    }


    //Test
    public static void main(String[] args) {

        String[] strings = {"", " ", "   u abc", "abc xyz"};
        System.out.println(countMultipleWords(strings));

        ArrayList<Integer> numbs = new ArrayList<>();
        numbs.add(2);
        numbs.add(-5);
        numbs.add(6);
        numbs.add(7);
        numbs.add(-10);
        numbs.add(-78);
        numbs.add(0);
        numbs.add(15);
        System.out.println(removeNegatives(numbs));

        String password = "Abcd1234";
        System.out.println(validatePassword(password));

        String email = "ak@gj.fj";
        System.out.println(validateEmailAddress(email));


    }
}
