package scratchPad;

import utilities.Counting;

import java.util.Arrays;
import java.util.Random;

public class WhiteBoard {
    public static void main(String[] args) {


//        System.out.println(Counting.countSpaces(sentence));

    String sentence = "123 Java, JavaScript, C# 456";
        System.out.println("There are "+Counting.countSpecials(sentence)+" specials.");


//        System.out.println(Counting.countLetters(sentence));
//
//        System.out.println(Counting.countDigits(sentence));



        int[] randomNumbers = new int[5];
        for(int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i] = new Random().nextInt(10);
            System.out.println(randomNumbers[i]);
        }int[] numbers = {0, 5, 3, 2, 4, 7, 10};

        System.out.println(Arrays.binarySearch(numbers, 5)>=0);

        String numbers1 = "jafjfj fjkjsfj ksfjkjsf";

        int count = 1;
        for(int i = 0; i < numbers1.length(); i++){
            if(numbers1.charAt(i) == ' ') count++;
        }
        System.out.println(count);

        int math = 5;

        System.out.println(Math.abs(21-math));


    }
}
