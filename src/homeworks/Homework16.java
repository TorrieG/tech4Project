package homeworks;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework16 {

    /*TASK-1
    Write a method countWords() that takes a String as an argument,
    and returns how many words there are in the given String

     */
    public static int countWords(String str){
        int a = 0;
        String[] string = str.trim().split(" ");
        for (String element : string) {
            if (element.isEmpty())break;
            a++;
        }
        return a;
    }

    //TASK-2
    /*
    Write a method countA() that takes a String as an argument,
    and returns how many A or a there are in the given String
     */
    public static int countA(String str){
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a') a++;
        }return a;
    }
    /*
    TASK-3
    Write a method countPos() that takes an ArrayList of Integer as an argument,
    and returns how many elements are positive
     */
    public static int countPos(ArrayList<Integer> numbers){
        int a = 0;
        for (Integer number : numbers) {
            if (number >0)a++;
        }return a;
    }
    /*
    TASK-4
    Write a method removeDuplicateNumbers() that takes an ArrayList of Integer as an argument,
    and returns it back with removed duplicates
     */
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers){
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
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> str){
        ArrayList<String> strings = new ArrayList<>();
        for (String element : str) {
                if (!strings.contains(element)) strings.add(element);
        }return strings;
    }




    public static void main(String[] args) {

        System.out.println(countWords("     Java is fun       "));
        System.out.println(countA("QA stands for Quality Assurance"));
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
        ArrayList<String> test = new ArrayList<>();
        test.add("java");
        test.add("ruby");
        test.add("c#");
        test.add("JAVA");
        test.add("ruby");
        test.add("c#");
        test.add("c++");
        System.out.println(removeDuplicateElements(test));






    }
}
