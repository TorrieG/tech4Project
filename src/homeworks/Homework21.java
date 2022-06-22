package homeworks;

public class Homework21 {
    /**
     * TASK-1
     * Create a method called fizzBuzz1()
     * This method will take an int argument, and it will print numbers starting from 1 to given argument.
     * BUT, it will print “Fizz” for the numbers divided by 3, “Buzz” for the numbers divided by 5, and “FizzBuzz”
     * for the numbers divided both by 3 and 5.
     */

    public static void fizzBuzz1(int number){
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
    /**
     * TASK-2
     * Create a method called fizzBuzz2()
     * This method will take an int argument, and it will return a String.
     * BUT it will return “Fizz” if the given number is divided by 3, “Buzz” if the number is divided by 5,
     * and “FizzBuzz” if the number is divided both by 3 and 5. Otherwise, it will return number itself.
     */
    public static String fizzBuzz2(int number){
        if (number % 15 == 0) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return (String.valueOf(number));

    }

    /**
     *TASK-3
     * Create a method called findSumNumbers()
     * This method will take a String argument, and it will return an int which is the sum of all numbers
     * presented in the String.
     *
     * NOTE: If there are no numbers represented in the String, return 0.
     */
    public static String findSumNumbers(String string){
        int sum = 0;
        String temp = "";

        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))){
                if (i < string.length() - 1 && Character.isDigit(string.charAt(i+1))){
                    temp += string.charAt(i);
                }
                else{
                    temp += string.charAt(i);
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        return String.valueOf(sum);
    }
    /**
     * TASK-3 REGEX
     */
    public static int findSumNumbersRegex(String s){
        int sum = 0;
        s = "0" + s;

        for (String num : s.trim().split("[^0-9]+")) sum += Integer.parseInt(num);
        return sum;
    }


    /**
     * TASK-4
     * Create a method called findBiggestNumber()
     * This method will take a String argument, and it will return an int which is the number presented in
     * the String.
     *
     * NOTE: If there are no numbers represented in the String, return 0.
     */
    public static int findBiggestNumber(String string){
        int biggestNumber = 0;
        int tempNumber;
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))){
                if (i < string.length()-1 && Character.isDigit(string.charAt(i+1))){
                    temp.append(string.charAt(i));
                }
                else{
                    temp.append(string.charAt(i));
                    tempNumber = Integer.parseInt(temp.toString());
                    if (tempNumber > biggestNumber) biggestNumber = tempNumber;
                    temp = new StringBuilder();
                }
            }
        }
        return biggestNumber;
    }

    /**
     * TASK-5
     * Create a method called countSequenceOfCharacters()
     * This method will take a String argument, and it will return a String which is the count of repeated
     * characters in a sequence in the String.
     * NOTE: If given String is empty, then return empty String.
     * NOTE: It is case sensitive!!!
     */

    public static String countSequenceOfCharacters(String string){
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (i < string.length()-1 && string.charAt(i) == string.charAt(i+1)){
                count ++;
            }
            else {
                count ++;
                result.append(count).append(string.charAt(i));
                count = 0;
            }
        }
        return result.toString();
    }



    public static void main(String[] args) {
//        fizzBuzz1(18);
//        System.out.println(fizzBuzz2(1));
//        System.out.println(findSumNumbers("a100b4c 6#"));
//        System.out.println(findBiggestNumber("a100b4c 600#"));
//        System.out.println(countSequenceOfCharacters("abbcca"));
        System.out.println(findSumNumbersRegex("a100b4c 6#"));
    }

}
