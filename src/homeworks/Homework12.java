package homeworks;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("\nTASK-1");

        int[] numbers = new int[10];

        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;

        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\nTASK-2");

        String[] letters = new String[5];

        letters[1] = "abc";
        letters[4] = "xyz";

        System.out.println(letters[3]);
        System.out.println(letters[0]);
        System.out.println(letters[4]);
        System.out.println(Arrays.toString(letters));

        System.out.println("\nTASK-3");

        int[] numbers3 = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(numbers3));
        Arrays.sort(numbers3);
        System.out.println(Arrays.toString(numbers3));

        System.out.println("\nTASK-4");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("\nTASK-5");

        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(dogs));
        boolean count = false;
        for (String dog : dogs) {
            if (dog.equals("Pluto")) {
                count = true;
                break;
            }
        }
        System.out.println(count);

        System.out.println("\nTASK-6");

        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
        int catCount = 0;
        for (String cat : cats) {
            if (cat.equals("Garfield")) catCount++;
            else if (cat.equals("Felix")) {
                catCount++;
                if (catCount == 2) break;
            }

        }
        System.out.println(catCount == 2);


        System.out.println("\nTASK-7");

        double[] doubles = {10.5, 20.75, 70, 80, 15.75};

        System.out.println(Arrays.toString(doubles));
        for (double duty : doubles) {
            System.out.println(duty);


        }
        System.out.println("\nTASK-8");

        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        System.out.println(Arrays.toString(characters));
        int letter = 0, upperCase = 0, lowerCase = 0, digits = 0, specials = 0;
        for (char character : characters) {
            if (Character.isLetter(character)) {
                letter++;
                if (Character.isUpperCase(character)) {
                    upperCase++;
                } else {
                    lowerCase++;
                }
            } else if (Character.isDigit(character)) {
                digits++;
            } else specials++;

        }
        System.out.println("Letters = " + letter);
        System.out.println("Uppercase letters = " + upperCase);
        System.out.println("Lowercase letters = " + lowerCase);
        System.out.println("Digits = " + digits);
        System.out.println("Special characters = " + specials);

        System.out.println("\nTASK-9");

        String[] supplies = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(supplies));
        int upper = 0, lower = 0, bORP = 0, bookOrPen = 0;
        for (String supply : supplies) {
            String lowSupply = supply.toLowerCase();
            if (supply.toLowerCase().contains("book") || supply.toLowerCase().contains("pen")) {
                bookOrPen++;

            }
            if (supply.toLowerCase().startsWith("b") || supply.toLowerCase().startsWith("p")) {
                bORP++;

            }
            if (Character.isUpperCase(supply.charAt(0))) {
                upper++;
            } else {
                lower++;
            }
        }
        System.out.println("Elements starts with uppercase = " + upper);
        System.out.println("Elements starts with lowercase = " + lower);
        System.out.println("Elements starting with B or P = " + bORP);
        System.out.println("Elements having \"book\" or \"pen\" = " + bookOrPen);

        System.out.println("\nTASK-10");

        int[] numbs = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(numbs));
        int ten = 0, less10 = 0;
        for (int numb : numbs) {
            if (numb == 10) ten++;
            else if (numb < 10) less10++;
        }
        System.out.println("Elements that are more than 10 = " + (11 - ten - less10));
        System.out.println("Elements that are less than 10 = " + less10);
        System.out.println("Elements that are 10 = " + ten);

        System.out.println("\nTASK-11");

        int[] first = {5, 8, 13, 1, 2}, second = {9, 3, 67, 1, 0}, third = new int[5];
        System.out.println("1st array is =  " + Arrays.toString(first));
        System.out.println("2nd array is = " + Arrays.toString(second));
        int next = 0;
        for (int f : first) {
            third[next] = Math.max(f, second[next]);
            next++;
        }
        System.out.println("3rd array is =  " + Arrays.toString(third));



    }
}
