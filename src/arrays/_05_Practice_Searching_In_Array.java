package arrays;

import java.util.Arrays;

public class _05_Practice_Searching_In_Array {
    public static void main(String[] args) {

        /*
        TASK-1
        Check the collection you have above and print true if it contains Mouse
        Print false otherwise
         */
        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};
        System.out.println("\nTASK-1");
        boolean mouse = false;
        for (String object : objects) {
            if (object.equals("Mouse")) {
                mouse = true;
                break;
            }
        }
        System.out.println(mouse);


        /*
        TASK-1
        Check the collection you have above and print true if one of the elements is board
        Print false otherwise
         */

        System.out.println("\nTASK-2");
        boolean board = false;
        for (String object : objects) {
            if (object.equals("board")) {
                board = true;
                break;
            }
        }
        System.out.println(board);

        System.out.println("TASK-3");
        Arrays.sort(objects); // My array is sorted "Keyboard", "Mouse","Mouse", "Remote", "iPad"
        //                       0         1       2        3       4
    /*
    TASK-3
            Check if you have an element equals to "iPad"
            If so, print true
            Else, print false

            "Remote", "Mouse","Mouse", "Keyboard", "iPad"

            Arrays class has binarySearch() method that helps us find if our collection contains a specific element or not
            NOTE: To be able to use this method, your array MUST be sorted first

            This method is taking 2 args, first is your array collection and the second is the element you are looking for

            1.One element is found -> it returns the index of the element - more than or equal to zero
            2.Multiple elements are found -> it returns the index of last occurrence
            3.No element found -> always returns negative index (-possible index -1)
     */
        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Apple") >= 0); // false
        System.out.println(Arrays.binarySearch(objects, "Keyboard") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Key") >= 0); // false

        System.out.println("\nTASK-4");
        /*
        TASK-4
        Create an int array to store below data
        {5, -2, 0, -7, 0, 5, 8, 45, 53}

        Check if collection has 5
        Check if collection has 0
        Check if collection has 45
        Check if collection has 3
        Check if collection has -7

        RESULT:
        true
        true
        true
        false
        true
         */
        int[] ints = {5, -2, 0, -7, 0, 5, 8, 45, 53};
        Arrays.sort(ints); // -7, -2, 0, 0, 5, 5, 8, 45, 53
        System.out.println(Arrays.binarySearch(ints, 5) >= 0);
        System.out.println(Arrays.binarySearch(ints, 0) >= 0);
        System.out.println(Arrays.binarySearch(ints, 45) >= 0);
        System.out.println(Arrays.binarySearch(ints, 3) >= 0);
        System.out.println(Arrays.binarySearch(ints, -7) >= 0);


    }
}
