package scratchPad;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {
        String[] green1 = new String[4];
        String[] green = {"Sean", "Torrie", "Taylor"};

        System.out.println(green[1]);

        int[] ages = {12, 4, 5};
        for (int age : ages) {
            System.out.println(age);

        }
        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(dogs));
        boolean count;
        for (String dog : dogs) {
            count = false;
            if (dog.equals("Pluto")) {
                count = true;
                System.out.println(count);
                break;
            }
        }Arrays.sort(green);
        System.out.println(Arrays.binarySearch(green, "Erica")>=0);


    }
}
