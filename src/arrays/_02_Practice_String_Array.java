package arrays;

import java.util.Arrays;
import java.util.Locale;

public class _02_Practice_String_Array {
    public static void main(String[] args) {
        System.out.println("\n----------TASK-1----------");
        /*
        Create a String array and store below data
        name of array will be students
        Alex
        Tom
        John
        James
        Jordan
        Lionel
        Adam

        1. Print the array
        2. Sort the array and print it again

        EXPECTED:
        Unsorted array = [Alex, Tom, John, James, Jordan, Lionel, Adam]
        Sorted array = [Adam, Alex, James, John, Jordan, Lionel, Tom]

         */
        String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
        System.out.println("Unsorted array = " + Arrays.toString(students));
        Arrays.sort(students);
        System.out.println("Sorted array = " + Arrays.toString(students));

        System.out.println("\n----------TASK-2----------");
        /*
        Print first and last names
         */
        System.out.println("First name is = " + students[0]);
        System.out.println("Last name is = " + students[students.length - 1]);

        System.out.println("\n----------TASK-3-for-each-loop----------");
        /*
        count how many names start with A
         */
        int count = 0;
        for (String student : students) {
            if (student.startsWith("A")) count++;
        }
        System.out.println(count);

        System.out.println("\n----------TASK-3-for-loop----------");
        count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].charAt(0) == 'A') count++;
        }
        System.out.println(count);

        System.out.println("\n----------TASK-4-for-loop----------");
        /*
        ["Adam", "Alex", "James", "John", "Jordan", "Lionel", "Tom"]
        count how many names contains a-A or e-E
        EXPECTED:
        5

        set counter to 0
        change to lowercase and check if it contains a or e
        if so add to count
        print count outside of loop
         */
        count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].toLowerCase().contains("a") || students[i].toLowerCase().contains("e")) count++;
        }
        System.out.println(count);

        System.out.println("\n----------TASK-4-for-each-loop----------");
        count = 0;
        for (String student : students) {
            String s = student.toLowerCase();
            if (student.contains("a") || student.contains("e")) count++;
        }
        System.out.println(count);

        System.out.println("\n----------TASK-5-for-each-loop----------");
        /*
        count how many names has at least 5 characters
        EXPECTED:
        3
         */

        count = 0;
        for (String student : students) {
            if (student.length() >= 5) count++;
        }
        System.out.println(count);

        /*
        EXTRA PRACTICE
        count how many names starts with J or j
        count how many names starts or ends with s or S
        count how many contains o-O
        count names that has even length
        count names with odd lengths
        count names that start with a vowel
         */
        System.out.println("\n----------TASK-6-for-each-loop----------");
        /*
        Check if the array has the element equal to "Jennifer"
         */
        boolean counter = false;
        for (String student : students) {
            if (student.equalsIgnoreCase("Jennifer")) {
                counter = true;
                break;
            }
        }
        System.out.println(counter);





    }
}
