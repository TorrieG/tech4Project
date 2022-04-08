package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        String[][] studentGroups = {
                {"Kaly", "Guluzar", "Melda"},
                {"Torrie", "David"},
                {"Abe", "Data"}};

        System.out.println(studentGroups[0][1]); // Guluzar
        System.out.println(studentGroups[1][0]); // Torrie
        System.out.println(studentGroups[1][1]); //

        // how to get the size of the studentGroups
        System.out.println(studentGroups.length); // 3

        // how to get the size of the second group
        System.out.println(studentGroups[1].length); // 2

        // how to print the third group
        System.out.println(Arrays.toString(studentGroups[2])); // [Abe, Data]

        // how to print all
        System.out.println(Arrays.deepToString(studentGroups)); // [[Kaly, Guluzar, Melda], [Torrie, David], [Abe, Data]]

        //how to print each group in separate lines
        for (String[] studentGroup : studentGroups) {
            System.out.println(Arrays.toString(studentGroup));
        }
        System.out.println("\n-----------Printing all members with fori loop -------------");
        // how to print each group
        for (int i = 0; i < studentGroups.length; i++) {
            for (int j = 0; j < studentGroups.length; j++) {
                System.out.println(studentGroups[i][j]);
            }
        }
        System.out.println("\n-----------Printing all members with for each loop -------------");
        for (String[] group : studentGroups) {
            for (String member : group) {
                System.out.println(member);
            }
        }
    }
}
