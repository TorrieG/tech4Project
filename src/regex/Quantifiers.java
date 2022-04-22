package regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        String watchThis = "My name is Torrie and and I love TechGlobal";
        System.out.println(Pattern.matches("[a-zA-Z0-9_-]{8,15}", "skjflk9af"));

        System.out.println(Pattern.matches("[a-z]+","hello"));//true --> contains 1 or more letters
        System.out.println(Pattern.matches("[a-zA-Z]{3,}", "hello class"));//false --> contains a space
        System.out.println(Pattern.matches("[A-Za-z0-9_-]{8,15}","TechGlobal-_1"));//true


        //Write a regex pattern for a phone number with the format of: (XXX)-XXX-XXXX

        System.out.println(Pattern.matches("\\([1-9][0-9]{2}\\)-[1-9][0-9]{2}-[\\d]{4}", "(708)-456-7890"));




    }
}
