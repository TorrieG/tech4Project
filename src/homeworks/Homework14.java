package homeworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("\nTASK-1");
        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};

        List<Integer> newNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    newNumbers.add(numbers[i]);
                    break;
                }
            }
        }
        if (newNumbers.isEmpty()) System.out.println("There are no duplicates");
        else System.out.println(newNumbers.get(0));

        System.out.println("\nTASK-2");
        String[] words = {"Z", "abc", "abc", "123", "#"};

        List<String> newString = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    newString.add(words[i]);
                    break;
                }
            }
        }
        if (newString.isEmpty()) System.out.println("There are no duplicates");
        else System.out.println(newString.get(0));

        System.out.println("\nTASK-3");
        int[] numbers3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        List<Integer> newNumbers3 = new ArrayList<>();

        for (int i = 0; i < numbers3.length - 1; i++) {
            for (int j = i + 1; j < numbers3.length; j++) {
                if (!newNumbers3.contains(numbers3[i]) && numbers3[i] == numbers3[j]) newNumbers3.add(numbers3[i]);
            }
        }
        if (newNumbers3.isEmpty()) System.out.println("There is no duplicate");
        else {
            for (Integer number : newNumbers3) System.out.println(number);
        }

        System.out.println("\nTASK-4");
        String[] words4 = {"A", "foo", "12", "Foo", "bar", "a", "A", "java"};
        String newWords = "";

        for (int i = 0; i < words4.length - 1; i++) {
            for (int j = i + 1; j < words4.length; j++) {
                if (words4[i].equalsIgnoreCase(words4[j]) && !newWords.contains(words4[i].toLowerCase())) {
                    newWords += words4[i].toLowerCase(); //ignore case goes here
                    System.out.println(words4[i]);
                }
            }
        }
        if (newWords.isEmpty()) System.out.println("There are no duplicates");

        System.out.println("\nTASK-5");
        String[] words5 = {"abc", "foo", "bar"};

        List<String> newWord5 = new ArrayList<>();
        for (int i = words5.length - 1; i >= 0; i--) {
            newWord5.add(words5[i]);
        }
        System.out.println(newWord5);

        System.out.println("\nTASK-6");
        String str = "Java is fun";
        String newStr = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        String[] newStrArr = newStr.split(" ");
        List<String> newStrList = new LinkedList<>();
        int counter = 0;

        for (int i = newStrArr.length - 1; i >= 0; i--) {
            newStrList.add(newStrArr[i]);
            System.out.print(newStrList.get(counter) + " ");
            counter++;
        }


    }
}



