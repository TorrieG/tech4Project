package homeworks;

import utilities.ScannerHelper;

public class Practice01 {
    public static void main(String[] args) {

        /*
        Assume that you are given a String as below;
String str = "SDLC is step by step procedure to create an application";
Write a program to find length of given String and the indexes of “SDLC” and “application” words
         */

        System.out.println("\n--------------TASK-1-----------\n");
        String str = "SDLC is step by step procedure to create an application";
        System.out.println("length = " + str.length()); // 55
        System.out.println("index of SDLC = " + str.indexOf("SDLC")); // 0
        System.out.println("index of application = " + str.indexOf("application")); // 44

        /*
        Requirement:
        Assume that you are given a String as below;
        String str2 = "  I know how to code with Python  ";
        •Write a program to manipulate given String and convert it to be:
        “I KNOW HOW TO CODE WITH JAVA”
         */

        System.out.println("\n--------------TASK-2-----------\n");
        String str2 = "  I know how to code with Python  ";
        System.out.println(str2.replace("Python","Java").trim().toUpperCase());

        /*
        Assume that you are given a String as below;
String str3 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ";
1.Find the first character of given String which is not white space
2.Find the last character of given String which is not white space
         */

        System.out.println("\n--------------TASK-3-----------\n");
        String str3 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ".trim();
        System.out.println("First char that is not space is = " + str3.charAt(0));
        System.out.println("Last char that is not space is = " + str3.charAt(str3.length()-1));

        /*
        Assume you are given 3 Strings as below;
String s1 = "  TECH ";
String s2 = " glo  ";
String s3 = " BAL       ";
Write a program that manipulates these 3 Strings and stores them in a new String s4 and s4 will get value of “TechGlobal”
Note: The length of s4 will be 10 at the end!!!
         */
        System.out.println("\n--------------TASK-4-----------\n");
        String s1 = "  TECH ".trim().replace("ECH","ech");
        String s2 = " glo  ".trim().replace("g","G");
        String s3 = " BAL       " .trim().toLowerCase();
        String s4 = s1.concat(s2)+s3;
        System.out.println(s4);
        System.out.println(s4.length());

        /*
        Write a program that asks user to enter their favorite color.
Then, print the first and last characters of the color
Also, print the first and last 3 characters of the color
Test data:
green
Expected output:
1st character is = g
last character is = n
First 3 characters are = gre
Last 3 characters are = een
         */
        System.out.println("\n--------------TASK-5-----------\n");
        String color = ScannerHelper.getANameFromUser();
        System.out.println("1st character is = "+color.charAt(0));
        System.out.println("Last character is = "+color.charAt(color.length()-1));
        System.out.println("First 3 characters are = "+color.substring(0,3));
        System.out.println("Last 3 characters are = "+color.substring(color.length()-3));

        /*
        Write a program that asks user to enter a full sentence
Then, convert all sentence to lower case and print the first and last words in the given sentence
Test data: JavA is an object-oriented programming LanguAGE
Expected output:
First word is = java
Last word is = language
         */
        System.out.println("\n--------------TASK-6-----------\n");
        String sentence = ScannerHelper.getASentenceFromUser().toLowerCase();
        System.out.println("First word is = "+sentence.substring(0,sentence.indexOf(' ')));
        System.out.println("Last word is = "+sentence.substring(sentence.lastIndexOf(' ')+1));

        /*
        Write a program that asks user to enter a full sentence
Then, check if given sentence contains $ character
If it contains $ character, then find the index of the $ character and print a proper message for the found index
Test data 1:
I saved $100 to buy new airpods
Expected output 1:
This sentence contains $ character
$ character’s index is = 8
Test data 2:
I’ll become a Software Engineer in Test
Expected output 2:
This sentence does not contain $ character
         */
        System.out.println("\n--------------TASK-7-----------\n");
        String str$ = ScannerHelper.getASentenceFromUser();
        if (str$.contains("$")){
            System.out.println("This sentence contains $ character" + "\n$ character’s index is = "+str$.indexOf("$"));
        }else {
            System.out.println("This sentence does not contain $ character");
        }
        System.out.println(str$.contains("$") ?
                "This sentence contains $ character" + "\n$ character's index is = " + str$.indexOf('$') :
                "This sentence does not contain $ character");


    }


}
