package homeworks;

import java.util.*;

public class Homework22 {

    /**
     * TASK-1
     * Create a method called fibonacciSeries1()
     * This method will take an int argument as n,
     * and it will return n series of Fibonacci numbers as an int array
     */
    public static int[] fibonacciSeries1(int n) {
        int zero = 0, one = 1, sum;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = zero;
            sum = zero + one;
            zero = one;
            one = sum;
        }
        return result;
    }

    /**
     * TASK-2
     * Create a method called fibonacciSeries2()
     * This method will take an int argument as n, and it will return
     * the nth series of Fibonacci number as an int.
     */
    public static int fibonacciSeries2(int n) {
        int zero = 0, one = 1, sum;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = zero;
            sum = zero + one;
            zero = one;
            one = sum;
        }
        return result[n - 1];
    }

    /**
     * TASK-3
     * Create a method called findUniques()
     * This method will take 2 int array argument, and it will return an int array
     * which has only the unique values from both given arrays.
     * NOTE: If both arrays are empty, then return an empty array.
     * NOTE: if one of the array is empty, then return unique values from the other array.
     */

    public static int[] findUniques(int[] array1, int[] array2) {

        // remove duplicates in each original array
        LinkedHashSet<Integer> temp1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> temp2 = new LinkedHashSet<>();

        for (int i : array1) temp1.add(i);
        for (int j : array2) temp2.add(j);

        // combine both arrays together without the duplicates from each
        List<Integer> combinedArrayList = new ArrayList<>(temp1);
        combinedArrayList.addAll(temp2);

        // add the dupes to a new arraylist
        List<Integer> dupesArrayList = new ArrayList<>();

        for (int i = 0; i < combinedArrayList.size() - 1; i++) {
            for (int j = i + 1; j < combinedArrayList.size(); j++) {
                if (Objects.equals(combinedArrayList.get(i), combinedArrayList.get(j))) {
                    dupesArrayList.add(combinedArrayList.get(i));
                    dupesArrayList.add(combinedArrayList.get(j));
                }
            }
        }
        // remove the dupes arraylist from the combined arraylist
        combinedArrayList.removeAll(dupesArrayList);

        // convert the combined arraylist without dupes to an int array
        int[] answer = new int[combinedArrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = combinedArrayList.get(i);
        }
        return answer;
    }

    /**
     * TASK-4
     * Create a method called isPowerOf3()
     * This method will take an int argument, and it will return true if given int argument is
     * equal to 3 power of the X. Otherwise, it will return false.
     * <p>
     * Numbers that are power of 3 = 1, 3, 9, 27, 81, 243….
     */
    public static boolean isPowerOf3(int number) {
        if (number < 1) {
            return false;
        }
        while (number % 3 == 0) {
            number /= 3;
        }
        return number == 1;
    }

    /**
     * TASK-5
     * Create a method called firstDuplicate()
     * This method will take an int array argument and it will return an int which is the first
     * duplicated number.
     * NOTE: All elements will be positive numbers.
     * NOTE: If there are no duplicates, then return -1
     * NOTE: If there are more than one duplicate, then return the one for which second occurrence
     * has the smallest index
     */

    public static int firstDuplicate(int[] arr) {
        int result = 0;
        if (arr.length == 0) return -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                result = arr[i];
                break;
            } else result = -1;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("\nTASK-1\n" + Arrays.toString(fibonacciSeries1(7)));
        System.out.println("\nTASK-2\n" + fibonacciSeries2(8));
        System.out.println("\nTASK-3\n" + Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));
        System.out.println("\nTASK-4\n" + isPowerOf3(81));
        System.out.println("\nTASK-5\n" + firstDuplicate(new int[]{1, 2, 3, 3, 4, 1}));
    }


}
