package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Homework16 {

    /*TASK-1
    Write a method countWords() that takes a String as an argument,
    and returns how many words there are in the given String

     */
    public static int countWords(String str) {
        int a = 0;
        if (str.isEmpty()) return 0;
        String[] string = str.trim().split(" ");
        for (String element : string) a++;
        return a;
    }

    //TASK-2
    /*
    Write a method countA() that takes a String as an argument,
    and returns how many A or a there are in the given String
     */
    public static int countA(String str) {
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a') a++;
        }
        return a;
    }

    /*
    TASK-3
    Write a method countPos() that takes an ArrayList of Integer as an argument,
    and returns how many elements are positive
     */
    public static int countPos(ArrayList<Integer> numbers) {
        int a = 0;
        for (Integer number : numbers) {
            if (number > 0) a++;
        }
        return a;
    }

    /*
    TASK-4
    Write a method removeDuplicateNumbers() that takes an ArrayList of Integer as an argument,
    and returns it back with removed duplicates
     */
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> newNumber = new ArrayList<>();
        for (Integer element : numbers) {
            if (!newNumber.contains(element)) newNumber.add(element);
        }
        return newNumber;
    }

    /*
    TASK-5
    Write a method removeDuplicateElements() that takes an ArrayList of String as an argument,
    and returns it back with removed duplicates
     */
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> str) {
        ArrayList<String> strings = new ArrayList<>();
        for (String element : str) {
            if (!strings.contains(element)) strings.add(element);
        }
        return strings;
    }

    /*
    TASK-6
    Write a method removeExtraSpaces() that takes a String as an argument,
    and returns a String with removed extra spaces
     */
    public static StringBuilder removeExtraSpaces(String str) {
        str = str.trim();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' || str.charAt(i + 1) != ' ') string.append(str.charAt(i));
        }
        return string;
    }

    /*
    TASK-7
    Write a method add() that takes 2 int[] arrays as arguments and
    returns a new array with the sum of given arrays elements.
     */
    public static String add(int[] a, int[] b) {
        int al = a.length, bl = b.length;
        int[] c = new int[Math.max(al, bl)];
        for (int i = 0; i < Math.min(al, bl); i++) {
            c[i] = a[i] + b[i];
        }
        for (int i = Math.min(al, bl); i < Math.max(al, bl); i++) {
            if (al > bl) c[i] = a[i];
            else c[i] = b[i];
        }
        return Arrays.toString(c);
    }

    /*
    TASK-8
    Write a method findClosestTo10() that takes an int[] array as an argument,
    and returns the closest element to 10 from given array
     */
    public static int findClosestTo10(int[] a) {
        int c = a[0], d = Math.abs(a[0] - 10);
        for (int i = 1; i < a.length; i++) {
            if (a[i] != 10 && Math.abs(a[i] - 10) < d || c == 10) {
                d = Math.abs(a[i] - 10);
                c = a[i];
            } else if (Math.abs(a[i] - 10) == d) {
                if (c > a[i]) c = a[i];
            }
        }
        return c;
    }


    public static void main(String[] args) {

        //Test TASK-1
        System.out.println(countWords("hjhk jhkj"));

        //Test TASK-2
        System.out.println(countA("QA stands for Quality Assurance"));

        //Test TASK-4
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);
        numbers.add(20);
        numbers.add(35);
        numbers.add(60);
        numbers.add(60);
        numbers.add(70);
        System.out.println(removeDuplicateNumbers(numbers));

        //Test TASK-5
        ArrayList<String> test = new ArrayList<>();
        test.add("java");
        test.add("ruby");
        test.add("c#");
        test.add("JAVA");
        test.add("ruby");
        test.add("c#");
        test.add("c++");
        System.out.println(removeDuplicateElements(test));

        //Test TASK-6
        System.out.println(removeExtraSpaces("   I   am      learning     Java      "));

        //Test TASK-7
        int[] a = {3, 0, 0, 7, 5, 10};
        int[] b = {6, 3, 2};

        System.out.println(add(a, b));

        //Test TASK-8
        int[] numbers1 = {10, -13, 5, 10, 8, 11, 70, 15, 57};
        System.out.println(findClosestTo10(numbers1));




    }
}
