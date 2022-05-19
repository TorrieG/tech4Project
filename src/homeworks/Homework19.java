package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework19 {

    /**
     * TASK-1
     * Create a method called noDigit()
     * -This method will take one String argument, and it will
     * return a new String with all digits removed from the original String
     */
    public static String noDigit(String str) {
        return str.replaceAll("[0-9]", "");
    }

    public static String noDigitAnotherWay(String str) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)))
                newString.append(str.charAt(i));
        }
        return newString.toString();
    }

    public static String notDigitsWay3(String str) {
        StringBuilder sing = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9'))
                sing.append(str.charAt(i));
        }
        return sing.toString();
    }

    /**
     * TASK-2
     * Create a method called noVowel()
     * This method will take one String argument, and it will return a new
     * String with all vowels removed from the original String
     */
    public static String noVowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    /**
     * TASK-3
     * Create a method called sumOfDigits()
     * This method will take one String argument, and it will return an int sum of
     * all digits from the original String.
     * <p>
     * NOTE: Return zero if there is no digits in the String
     */
    public static int sumOfDigits(String str) {
        List<String> sum = new ArrayList<>(Arrays.asList(str.split("")));
        int newSum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                newSum += Integer.parseInt(sum.get(i));
            }
        }
        return newSum;
    }

    /**
     * TASK-4
     * Create a method called hasUpperCase()
     * This method will take one String argument, and it will return boolean true
     * if there is an uppercase letter and false otherwise.
     */
    public static boolean hasUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * TASK-5
     * Create a method called middleInt()
     * This method will take three int arguments, and it will return the middle int.
     */
    public static int middleInt(int a, int b, int c) {
        int[] middle = {a, b, c};
        Arrays.sort(middle);
        return middle[1];
    }

    /**
     * TASK-6
     * Create a method called no13()
     * This method will take an int array as argument, and it will return a
     * new array with all 13 replaced with 0.
     * <p>
     * NOTE: Assume length will always be more than zero.
     */
    public static int[] no13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) nums[i] = 0;
        }
        return nums;
    }

    /**
     * TASK-7
     * Create a method called arrFactorial()
     * This method will take an int array as argument, and it will return the array
     * with every number replaced with their factorials.
     * <p>
     * NOTE: Assume length will always be more than zero.
     * NOTE: 0! is equals to 1
     */

    public static int[] arrFactorial(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0 || numbers[i] == 1) numbers[i] = 1;
            else {
                int number = numbers[i];
                for (int j = 2; j < number; j++) {
                    numbers[i] *= j;
                }
            }
        }
        return numbers;
    }

    /**
     * TASK-8
     * Create a method called categorizeCharacters()
     * This method will take String as an argument and return a String array as
     * letters at index of 0, digits at index of 1 and specials at index of 2.
     * NOTE: IGNORE SPACES
     * <p>
     * NOTE: Assume length will always be more than zero.
     */

    public static String[] categorizeCharacters(String string) {
        String[] category = {"", "", ""};
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) category[0] += string.charAt(i);
            else if (Character.isDigit(string.charAt(i))) category[1] += string.charAt(i);
            else if (string.charAt(i) != ' ') category[2] += string.charAt(i);
        }
        return category;
    }


    public static void main(String[] args) {
        System.out.println("TASK-1\n" + noDigit("noDigit = 123Hello World149\n") +
                noDigitAnotherWay("noDigitAnotherWay = 123Hello World149\n") +
                notDigitsWay3("noDigitWayThree = 123Hello World149"));

        System.out.println("\nTASK-2\n" + noVowel("TechGlobal"));

        System.out.println("\nTASK-3\n" + sumOfDigits("John’s age is 29"));

        System.out.println("\nTASK-4\n" + hasUpperCase("John’s age is 29"));

        System.out.println("\nTASK-5\n" + middleInt(-1, 25, 10));

        int[] nums = {13, 2, 3};
        System.out.println("\nTASK-6\n" + Arrays.toString(no13(nums)));

        int[] nums1 = {1, 2, 3, 4};
        System.out.println("\nTASK-7\n" + Arrays.toString(arrFactorial(nums1)));

        System.out.println("\nTASK-8\n" + Arrays.toString(categorizeCharacters("12ab$%3c%")));

    }

}
