package projects;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("TASK-1");
        String s1 = "24", s2 = "5";
        Integer int1 = Integer.valueOf(s1);
        Integer int2 = Integer.valueOf(s2);
        double double1 = Double.parseDouble(s1);
        double double2 = Double.parseDouble(s2);
        System.out.println("The sum of 24 and 5 = " + (int1 + int2));
        System.out.println("The subtraction of 24 and 5 = " + (int1 - int2));
        System.out.println("The division of 24 and 5 = " + (double1 / double2));
        System.out.println("The multiplication of 24 and 5 = " + (int1 * int2));
        System.out.println("The remainder of 24 and 5 = " + (int1 % int2));

        System.out.println("\nTASK-2");
        int t21 = (int) (Math.random() * 35) + 1;
        System.out.println("Random number = " + t21);
        if (t21 == 2 || t21 == 3 || t21 == 5 || t21 == 7 || t21 == 11 || t21 == 13 || t21 == 17 || t21 == 19 || t21 == 23 || t21 == 29 || t21 == 31) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else {
            System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
        }
        System.out.println("\nTASK-3");
        int t31 = (int) (Math.random() * 50) + 1, t32 = (int) (Math.random() * 50) + 1, t33 = (int) (Math.random() * 50) + 1;
        int test = 1;
        int min = (int) (Math.min(Math.min(t31, t32), t33));
        int max = (int) (Math.max(Math.max(t31, t32), t33));
        System.out.println("Random number " + test++ + " = " + t31);//didn't require random numbers to be printed
        System.out.println("Random number " + test++ + " = " + t32);// I wanted to see them
        System.out.println("Random number " + test + " = " + t33);
        System.out.println("Lowest number is = " + min);
        if (t31 != max && t31 != min) {
            System.out.println("Middle number is = " + t31);
        } else if (t32 != max && t32 != min) {
            System.out.println("Middle number is = " + t32);
        } else {
            System.out.println("Middle number is = " + t33);
        }
        System.out.println("Greatest number is =" + max);

        System.out.println("\nTASK-4");
        char t41 = '5';
        if ((t41 >= 65 && t41 <= 90) || (t41 >= 97 && t41 <= 122)) {
            if (t41 >= 65 && t41 <= 90) {
                System.out.println("The letter is uppercase");
            } else {
                System.out.println("The letter is lowercase");
            }
        } else {
            System.out.println("Invalid character detected!!!");
        }
        System.out.println("\nTASK-5");
        char t51 = 'R';
        if ((t51 >= 65 && t51 <= 90) || (t51 >= 97 && t51 <= 122)) {
            if (t51 == 65 || t51 == 97 || t51 == 69 || t51 == 101 || t51 == 73
                    || t51 == 105 || t51 == 79 || t51 == 111 || t51 == 85 || t51 == 117)
                System.out.println("The letter is a vowel");
            else System.out.println("The letter is a consonant");

        } else System.out.println("Invalid character detected!!!");

        System.out.println("\nTASK-6");
        char t61 = '*';
        if ((t61 >= 'a' && t61 <='z')|| (t61 >= 'A' && t61 <='Z')||(t61 >= '0' && t61 <='9'))
            System.out.println("Invalid character detected!!!");
        //if ((t61 >= 32 && t61 <= 47) || (t61 >= 58 && t61 <= 64) || (t61 >= 91 && t61 <= 96) || (t61 >= 123 && t61 <= 126))
            //System.out.println("Special character is = " + t61);
        else System.out.println("Special character is = " + t61);


        System.out.println("\nTASK-7");
        char t71 = '@';
        if ((t71 >= 65 && t71 <= 90) || (t71 >= 97 && t71 <= 122)) System.out.println("Character is a letter");
        else if (t71 >= 48 && t71 <= 57) System.out.println("Character is a digit");
        else System.out.println("Character is a special Character");

    }

}





