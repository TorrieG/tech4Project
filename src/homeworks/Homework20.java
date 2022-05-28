package homeworks;

import java.util.*;

public class Homework20 {

    /**
     * TASK-1
     * Create a method called hasLowerCase()
     * This method will take a String argument, and it will return boolean
     * true if there is lowercase letter and false if it doesn’t.
     */
    public static boolean hasLowerCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) return true;
        }
        return false;
    }

    /**
     * TASK-2
     * Create a method called noZero()
     * This method will take one Integer ArrayList argument, and it will return an ArrayList
     * with all zeros removed from the original Integer ArrayList.
     *
     * NOTE: Assume that ArrayList size will be at least 1.
     */
    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers){
        ArrayList<Integer> zeroFree = new ArrayList<>();
        for (Integer number : numbers) {
            if (number != 0) zeroFree.add(number);
        }return zeroFree;
    }

    /**
     * TASK-3
     * Create a method called numberAndSquare()
     * This method will take an int array argument, and it will return a multidimensional
     * array with all numbers squared.
     *
     * NOTE: Assume that array size is at least 1.
     */
    public static int[][] numberAndSquare(int[] ints){
       int[][] intsSquare = new int[ints.length][2];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) intsSquare[i][j] = ints[i];
                else intsSquare[i][j] = intsSquare[i][0] * intsSquare[i][0];
            }
        }
        return intsSquare;
    }


    /**
     * TASK-4
     * Create a method called containsValue()
     * This method will take a String array and a String argument, and it will return a boolean.
     * Search the variable inside the array and return true if it exists in the array.
     * If it doesn’t exist, return false.
     * NOTE: Assume that array size is at least 1.
     * NOTE: The method is case-sensitive@param args
     */
    public static boolean containsValue(String[] strings, String string){
        for (String s : strings) {
            if (s.contains(string)) return true;
        }return false;
    }

    /**
     *TASK-5
     * Create a method called reverseSentence()
     * This method will take a String argument, and it will return a String with changing the place of every word.
     * All words should be in reverse order. Make sure that there are two words inside the sentence at least.
     * If there is no two words return “There is not enough words!”.
     *
     * NOTE: After you reverse, only first letter must be uppercase and the rest will be lowercase!
     * Note: Make the new first word’s first letter upper case and make the old first word’s first letter lower case
     */
    public static String reverseSentence(String string){
        String[] words = string.toLowerCase().split(" ");
        StringBuilder reverse = new StringBuilder();
        String notEnough = "There is not enough words!";
        for (int i = words.length-1; i >= 0; i--) {
            if (words.length <= 1) return notEnough;
            else reverse.append(words[i]).append(" ");
        }
        return reverse.substring(0,1).toUpperCase() + reverse.substring(1, reverse.length()-1);
    }

    /**
     *TASK-6
     * Create a method called removeStringSpecialsDigits()
     * This method will take a String as argument, and it will return a String without the special characters or digits.
     * NOTE: Assume that String length is at least 1.
     * NOTE: Do not remove spaces.
     */
    public static String removeStringSpecialsDigits(String string){

        return string.replaceAll("[^a-z^A-Z ]", "");
    }

    /**
     *TASK-7
     * Create a method called removeArraySpecialsDigits()
     * This method will take a String array as argument, and it will return a String array without the special characters
     * or digits from the elements.
     * NOTE: Assume that array size is at least 1.
     */
    public static String[] removeArraySpecialsDigits(String[] strings){
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replaceAll("[^a-z^A-Z]", "");
        }
        return strings;
    }

    /**
     *TASK-8
     * Create a method called removeAndReturnCommons()
     * This method will take two String ArrayList, and it will return all the common words as String ArrayList.
     * NOTE: Assume that both ArrayList sizes are at least 1.
     */
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> commons = new ArrayList<>();
        for (int i = 0; i < list1.size()-1; i++) {
            for (int j = i+1; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) commons.add(list1.get(i));
            }
        }
        return commons;
    }

    /**
     *TASK-9
     * Create a method called noXInVariables()
     * This method will take an ArrayList argument, and it will return an ArrayList with all the x or X removed from elements.
     * If the element itself equals to x or X or contains only x letters, then remove that element.
     * NOTE: Assume that ArrayList size is at least 1.
     */
    public static ArrayList<String> noXInVariables(ArrayList<String> strings){
        ArrayList<String> strings1 = new ArrayList<>();
        for (String string : strings) {
            String xyz = string.replaceAll("[xX]", "");
            if (xyz.length() > 0) strings1.add(xyz);
        }
        return strings1;
    }


    public static void main(String[] args) {
        System.out.println(hasLowerCase("hello"));
        ArrayList<Integer> tester = new ArrayList<>();
        tester.add(0);
        tester.add(1);
        tester.add(10);
        System.out.println(noZero(tester));

        System.out.println(containsValue(new String[]{"abc", "def", "123"}, "123"));
        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));
        String[] xyz = {"Java", "is", "fun"};
        String[] xxx = {"xxx", "1www.x2X3","is", "Python"};
        ArrayList<String> abc = new ArrayList<>();
        Collections.addAll(abc, xyz);
        ArrayList<String> aaa = new ArrayList<>();
        Collections.addAll(aaa, xxx);

        System.out.println(Arrays.toString(removeArraySpecialsDigits(xxx)));
        System.out.println(removeAndReturnCommons(abc, aaa));
        System.out.println(noXInVariables(aaa));

        int[] ints = {1, 4};
        System.out.println(Arrays.deepToString(numberAndSquare(ints)));
        System.out.println(reverseSentence("Hello"));
    }
}
