package arrays;

public class _07_Practice_Find_The_Longest_String {
    public static void main(String[] args) {


        String[] colors = {"red", "blue", "yellow", "brown", "white"};
        /*
        find the string that has the most characters and print it
        RESULT:
        yellow
         */


        String newColor = "";
        for (String color : colors) {
            if (color.length() > newColor.length()) newColor = color;
        }
        System.out.println(newColor);

    }
}
