package homeworks;

import java.util.*;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("\nTASK-1");
        for (int i = 1; i <= 10; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 5 == 0) System.out.println("Bar");
            else if (i % 2 == 0) System.out.println("Foo");
            else System.out.println(i);
        }
        System.out.println("\nTASK-2");
        int pos = 0, neg = 0;
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        for (int number : numbers) {
            if (number > 0 && pos == 0) {
                System.out.println("First positive number is: " + number);
                pos++;
            } else if (number < 0 && neg == 0) {
                System.out.println("First negative number is: " + number);
                neg++;
            }
            if (neg == 1 && pos == 1) break;
        }
        System.out.println("\nTASK-3");


        int[] randoms = new int[5];
        for (int i = 0; i < 5; i++) {
            randoms[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(randoms));
        boolean randomCount = false;
        for (int random : randoms) {
            if (random == 2 || random == 3) {
                randomCount = true;
                ;
                break;
            }
        }
        System.out.println(randomCount);

        System.out.println("\nTASK-4");
        int no = 0;
        String[] list = {"banana", "apple", "orange", "grape"};
        for (String l : list) {
            if (l.equalsIgnoreCase("apple")) {
                System.out.println(true);
                break;
            } else {
                no++;
                if (list.length == no) System.out.println(false);
            }
        }
        System.out.println("\nTASK-5");

        int[] numbers1 = {30, 50, 70};
        int[] numbers2 = {20, 100, 300};
        int n2 = 0;

        for (int i : numbers1) {
            for (int i1 : numbers2) {
                if (i == i1) {
                    System.out.println(i);
                } else {
                    n2++;
                    if (numbers2.length == n2) System.out.println("There is no matching elements");
                }
            }
        }
        System.out.println("\nTASK-6");

        String str = "baNana";
        String duplicates = "";

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {

                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) &&
                !duplicates.contains(str.toLowerCase().substring(i,( i+1)))){
                    duplicates += str.toLowerCase().charAt(i);
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }










    }
}

















