package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework15 {

    public static void main(String[] args) {


        System.out.println("\nTASK-1");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\nTASK-2");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");
        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\nTASK-3");
        List<Integer> sortNumbers = new ArrayList<>();
        sortNumbers.add(23);
        sortNumbers.add(-34);
        sortNumbers.add(-56);
        sortNumbers.add(0);
        sortNumbers.add(89);
        sortNumbers.add(100);
        System.out.println(sortNumbers);
        Collections.sort(sortNumbers);
        System.out.println(sortNumbers);

        System.out.println("\nTASK-4");
        List<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\nTASK-5");
        List<String> marvel = new ArrayList<>();
        marvel.add("Spider Man");
        marvel.add("Iron Man");
        marvel.add("Black Panther");
        marvel.add("Deadpool");
        marvel.add("Captain America");
        System.out.println(marvel);
        System.out.println(marvel.contains("Wolverine"));

        System.out.println("\nTASK-6");
        List<String> avengers = new ArrayList<>();
        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");
        Collections.sort(avengers);
        System.out.println(avengers);
        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));

        System.out.println("\nTASK-7");
        List<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('x');
        characters.add('$');
        characters.add('%');
        characters.add('9');
        characters.add('*');
        characters.add('+');
        characters.add('F');
        characters.add('G');
        System.out.println(characters);
        for (Character character : characters) {
            System.out.println(character);
        }

        System.out.println("\nTASK-8");
        List<String> office = new ArrayList<>();
        office.add("Desk");
        office.add("Laptop");
        office.add("Mouse");
        office.add("Monitor");
        office.add("Mouse-Pad");
        office.add("Adapter");
        System.out.println(office);
        Collections.sort(office);
        System.out.println(office);
        int m = 0, ae = 0;
        for (String s : office) {
            if (s.toUpperCase().contains("M")) m++;
            if (!s.toUpperCase().contains("A") && !s.toUpperCase().contains("E")) ae++;
        }
        System.out.println(m);
        System.out.println(ae);

        System.out.println("\nTASK-9");
        List<String> kitchen = new ArrayList<>();
        kitchen.add("Plate");
        kitchen.add("spoon");
        kitchen.add("fork");
        kitchen.add("Knife");
        kitchen.add("cup");
        kitchen.add("Mixer");
        System.out.println(kitchen);
        int upper = 0, lower = 0, hasP = 0, startsEndsP = 0;
        for (String s : kitchen) {
            if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') upper++;
            else lower++;
            if (s.toUpperCase().contains("P")) {
                hasP++;
                if (s.toUpperCase().startsWith("P") || s.toUpperCase().endsWith("P")) startsEndsP++;
            }
        }
        System.out.println("Elements starts with uppercase = " + upper);
        System.out.println("Elements starts with lowercase = " + lower);
        System.out.println("Elements having P or p= " + hasP);
        System.out.println("Elements starting or ending with P or p = " + startsEndsP);

        System.out.println("\nTASK-10");
        Integer[] numbs = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        List<Integer> numbsList = new ArrayList<>(Arrays.asList(numbs));
        System.out.println(numbsList);
        int even15 = 0, odd20 = 0, ten = 0, lessGreater = 0;
        for (Integer integer : numbsList) {
            if (integer % 2 == 0 && integer > 15) even15++;
            if (integer % 10 == 0) ten++;
            if (integer < 15 || integer > 50) lessGreater++;
            if (integer % 2 == 1 && integer < 20) odd20++;
        }
        System.out.println("Elements that can be divided by 10 = " + ten);
        System.out.println("Elements that are even and greater than 15 = " + even15);
        System.out.println("Elements that are odd and less than 20 = " + odd20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + lessGreater);


    }
}
