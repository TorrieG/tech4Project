package homeworks;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HomeworkR4 {

    /**
    TASK-1
     Create a method called noSpace()
    This method will take one String argument, and it will return a new String with all spaces
    removed from the original String
     */
    public static String noSpace(String str){
        return str.replaceAll(" ", "");
    }

    /**
     TASK-2
     Create a method called replaceFirstLast()
     This method will take one String argument, and it will return a new String with first and
     last characters replaced

     NOTE: if the length is less than 2, then return empty String
     NOTE: Ignore all before and after spaces (get actual String only)
     */
    public static String replaceFirstLast(String string){
        String str = string.trim();
        if (str.length() == 2) return "" + str.charAt(1) + str.charAt(0);
        else if (str.length() < 2) return "";
        return str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
    }

    /**
     TASK-3
     Create a method called hasVowel()
     This method will take one String argument, and it will return a boolean checking
     if String has any vowel or not
     */
    public static boolean hasVowel(String str){
        return (str.trim().toLowerCase().contains("a") || str.trim().toLowerCase().contains("e") ||
                str.trim().toLowerCase().contains("i") || str.trim().toLowerCase().contains("o") ||
                str.trim().toLowerCase().contains("u"));
    }

    /**
     TASK-4
     Create a method called checkAge()
     This method will take an int yearOfBirth as argument, and it will print message below based on the entry
     If the age is less than 16, then print “AGE IS NOT ALLOWED”
     If the age is 16 or more, then print “AGE IS ALLOWED”
     If the age is more than 100 or a future year entered, print “AGE IS NOT VALID”
     NOTE: Calculate the age taking base year as current year in a dynamic way. You can use Date class.
     */
    public static void checkAge(int yearOfBirth){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(dateFormat.format(date));

        if (yearOfBirth > currentYear || currentYear - yearOfBirth > 100) System.out.println("AGE IS NOT VALID");
        else if (currentYear - yearOfBirth < 16 ) System.out.println("AGE IS NOT ALLOWED");
        else if (currentYear - yearOfBirth >= 16) System.out.println("AGE IS ALLOWED");
    }

    /**
     TASK-5
     Create a method called averageOfEdges()
     This method will take three int arguments, and it will return average of min and max numbers
     */
    public static int averageOfEdges(int a, int b, int c){
        int[] ints = {a,b,c};
        Arrays.sort(ints);
        return (ints[0] + ints[2])/2;
    }

    /**
     Create a method called noA()
     This method will take a String array argument, and it will return a new array with all elements
     starting with A or a replaced with “###”

     NOTE: Assume length will always be more than zero
     NOTE: Ignore cases
     */
    public static String[] noA(String[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i].toLowerCase().startsWith("a")) a[i] = "###";
        }
        return a;
    }

    /**
     TASK-7
     Create a method called no3or5()
     This method will take an int array argument, and it will return a new array with some elements replaced as below
     If element can be divided by 5, replace it with 99
     If element can be divided by 3, replace it with 100
     If element can be divided by both 3 and 5, replace it with 101

     NOTE: Assume length will always be more than zero
     */
    public static int[] no3or5(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 15 == 0) a[i] = 101;
            else if (a[i] % 3 == 0) a[i] = 100;
            else if (a[i] % 5 == 0) a[i] = 99;
        }
        return a;
    }

    /**
     TASK-8
     Create a method called countPrimes()
     This method will take an int array argument, and it will return how many elements
     in the array are prime numbers

     NOTE: Prime number is a number that can be divided only by 1 and itself
     NOTE: Negative numbers cannot be prime
     Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
     NOTE: Smallest prime number is 2
     */
    public static int countPrimes(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (num == 2 || num == 3) count++;
            else if (num > 3){
                boolean prime = true;
                for (int i = 2; i <= num / 2; i++) {
                    if (num % 2 == 0){
                        prime = false;
                        break;
                    }
                }if (prime) count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(noSpace("Hello World"));

        System.out.println(replaceFirstLast("Tech Global"));

        System.out.println(hasVowel("ABC"));

        checkAge(2007);

        System.out.println(averageOfEdges(10,13,20));

        String[] a = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(a)));

        int[] b = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(b)));

        int[] c = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(c));
    }
}
