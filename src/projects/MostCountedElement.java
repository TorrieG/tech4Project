package projects;

import java.util.ArrayList;

public class MostCountedElement {



    /*
    TASK-6 findMostRepeatedElementInAnArray() method
    Write a method that takes a String array. Find the most repeated element
    and print it.

    Test data:
    ["pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"]

    Expected output:
    pen
     */

    public static void findMostRepeatedElementInAnArray(String[] arr) {
        String mostCountedWord = "";
        int mostCountedCount = 0;

        ArrayList<String> countedElements = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            int countOfWord = 0;

            if (!countedElements.contains(word)) {
                for (String element : arr) {
                    if (word.equals(element)) countOfWord++;
                }

                if (countOfWord > mostCountedCount) {
                    mostCountedWord = word;
                    mostCountedCount = countOfWord;
                }
                countedElements.add(word);
            }
        }

        System.out.println(mostCountedWord + " counted " + mostCountedCount + " times in this array");
    }


    public static void main(String[] args) {
        String[] words = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        String[] words2 = {"a", "a", "b", "c"}; // a counted 2 times in this array
        String[] words3 = {"abc", "ABC", "ab", "ab", "abc", "ab"}; // ab counted 3 times in this array


        findMostRepeatedElementInAnArray(words);
        findMostRepeatedElementInAnArray(words2);
        findMostRepeatedElementInAnArray(words3);
        findMostRepeatedElementInAnArray(new String[]{"x", "y", "z", "y"});


    }
}
