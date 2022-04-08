package projects;

import utilities.*;

import java.util.Locale;
import java.util.Scanner;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("\n------------TASK-1------------\n");
        String str11 = ScannerHelper.getAStringFromUser();
        System.out.println(str11.length() < 8 ? "This String does not have 8 characters" :
                str11.substring(str11.length()-4) + str11.substring(4,str11.length()-4) + str11.substring(0,4));


        System.out.println("\n------------TASK-2------------\n");

        String s = ScannerHelper.getASentenceFromUser().trim();
        System.out.println(s.length() >= 2 ? s.substring(s.lastIndexOf(' ')+1) +
                s.substring(s.indexOf(' '),s.lastIndexOf(' ')+1)+ s.substring(0,s.indexOf(' ')) :
                "This sentence does not have 2 or more words to swap");


        System.out.println("\n------------TASK-3------------\n");

        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";
        System.out.println(str1.replace("stupid","nice"));
        System.out.println(str2.replace("idiot", "nice"));
        System.out.println(str3.replace("idiot","nice").replace("stupid","nice"));


        System.out.println("\n------------TASK-4------------\n");

        String name = ScannerHelper.getANameFromUser();
        System.out.println(name.length() < 2 ? "Invalid input!!!" : StringHelper.getMiddle(name));

        System.out.println("\n------------TASK-5------------\n");

        String country = ScannerHelper.getANameFromUser();
        System.out.println(country.length() < 5 ? "Invalid input!!!" : country.substring(2,country.length()-2));

        System.out.println("\n------------TASK-6------------\n");

        String add = ScannerHelper.getAnAddressFromUser();
        System.out.println(add.replace('a','*').replace('A','*')
                .replace('e','#').replace('E','#').replace('i','+')
                .replace('I','+').replace('o','@').replace('o','@')
                .replace('u','$').replace('U','$'));

        System.out.println("\n------------TASK-7------------\n");

        int num1 = RandomNumberGenerator.getRandomNumber(0,25);
        int num2 = RandomNumberGenerator.getRandomNumber(0,25);
        System.out.println("1st random # is = "+num1);
        System.out.println("2nd random # is = "+num2);

        if(num1<num2) for (int i = num1; i <= num2; i++) {
                if (i % 5 != 0) System.out.println(i);

        }else for (int i = num2; i <= num1; i++) {
                if (i % 5 != 0) System.out.println(i);


        }
          /*
        FIRST WAY

        if(num1 > num2){
            for (int i = num2; i <= num1; i++) {
                if(i % 5 != 0) System.out.println(i);
            }
        }
        else{
            for (int i = num1; i <= num2; i++) {
                if(i % 5 != 0) System.out.println(i);
            }
        }
        */


        /*
        SECOND WAY
        for(int i = minNumber; i <= maxNumber; i++){
            if(i % 5 != 0) System.out.println(i);
        }
         */

        String w = "";

        for(int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++){
            if(i % 5 != 0) w += i + " - ";
        }

        if(!w.isEmpty()) System.out.println(w.substring(0, w.length()-3));
        else System.out.println(w);

    }


    }


