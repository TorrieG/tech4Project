package collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise03_count_each_character_in_String {
    public static void main(String[] args) {
        String word = "Chicago is a nice city";
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
        for (Character c : word.toCharArray()) {
            if (!charCount.containsKey(c)) charCount.put(c,1);
            else charCount.put(c,charCount.get(c) + 1);

        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : charCount.entrySet()) {
            System.out.println(characterIntegerEntry);

        }
    }
}
