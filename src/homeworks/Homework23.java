package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {


    /**
     * Requirement:
     * Write a method called as parseData() which takes a String has some keys in {} and values after between }{ and returns a collection that has all the keys and values as entries.
     * NOTE: The keys should be sorted!
     */

    public static TreeMap<Integer, String> parseData(String str) {
        TreeMap<Integer, String> result = new TreeMap<>();
        StringBuilder key = new StringBuilder();
        StringBuilder value = new StringBuilder();

        for (int i = 1; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))) {
                if (Character.isDigit(str.charAt(i)))
                    key.append(str.charAt(i));
                else value.append(str.charAt(i));
            } else if (str.charAt(i) == '{') {
                result.put(Integer.parseInt(key.toString()), value.toString());
                key = new StringBuilder();
                value = new StringBuilder();
            }
        }
        result.put(Integer.parseInt(key.toString()), value.toString());

        return result;
    }


    /**
     * Requirement:
     * Write a method called as calculateTotalPrice1() which takes a Map of some shopping items with their amounts and calculates the total prices as double. Item prices are given below
     * Apple = $2.00
     * Orange = $3.29
     * Mango = $4.99
     * Pineapple = $5.25
     */

    public static double calculateTotalPrice1(Map<String, Integer> list) {
        double total = 0;
        Map<String, String> given = new HashMap<>();
        given.put("Apple", "2.00");
        given.put("Orange", "$3.29");
        given.put("Mango", "4.99");
        given.put("Pineapple", "$5.25");

        for (String fruit : list.keySet()) {
            for (String f : given.keySet()) {
                if (f.equals(fruit)) {
                    total += Double.parseDouble(given.get(f).replace("$", "")) * Double.valueOf(list.get(fruit));
                    break;
                }
            }
        }
        return total;
    }

    /**
     * Requirement:
     * Write a method calculateTotalPrice2() which takes a Map of some shopping items with their amounts and calculates the total prices as double. Item prices are given below
     * Apple = $2.00
     * Orange = $3.29
     * Mango = $4.99
     * <p>
     * BUT there will be some discounts as below
     * There will be %50 discount for every second Apple
     * There will be 1 free Mango if customer gets 3. So, fourth one is free.
     */

    public static double calculateTotalPrice2(Map<String, Integer> list) {
        double total = 0;
        Map<String, String> given = new HashMap<>();
        given.put("Apple", "2.00");
        given.put("Orange", "$3.29");
        given.put("Mango", "4.99");

        for (String f : list.keySet()) {
            for (String fruit : given.keySet()) {
                if (f.equals(fruit)) {
                    switch (f) {
                        case "Apple":
                            for (int i = 1; i <= list.get(f); i++) {
                                if (i % 2 != 0) total += Double.parseDouble(given.get(fruit).replace("$", ""));
                                else total += Double.parseDouble(given.get(fruit).replace("$", "")) * .5;
                            }
                            break;
                        case "Mango":
                            for (int i = 1; i <= list.get(f); i++) {
                                if (i % 4 != 0) total += Double.parseDouble(given.get(fruit).replace("$", ""));
                            }
                            break;
                        case "Orange":
                            for (int i = 1; i <= list.get(f); i++) total += Double.parseDouble(given.get(fruit).replace("$", ""));
                            break;
                    }
                }
            }
        }

        return total;
    }


    public static void main(String[] args) {
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));
        Map<String, Integer> testPrice = new HashMap<>();
        testPrice.put("Apple", 2);
//        testPrice.put("Mango", 5);
        testPrice.put("Pineapple", 1);
        testPrice.put("Orange", 3);
        Map<String, Integer> testPrice2 = new HashMap<>();
        testPrice2.put("Apple", 4);
        testPrice2.put("Mango", 8);
        testPrice2.put("Orange", 3);
        System.out.println(calculateTotalPrice1(testPrice));
        System.out.println(calculateTotalPrice2(testPrice2));
    }
}
