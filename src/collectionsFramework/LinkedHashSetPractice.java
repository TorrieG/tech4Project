package collectionsFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    public static void main(String[] args) {

        //Use when not interested in duplicates and indexes is not important, but you want to maintain insertion order
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Foo");
        words.add("Bar");
        words.add("foo");
        words.add("BAR");
        words.add(null);//nulls
        words.add("John");
        words.add("John");//no duplicates

        System.out.println(words);//[Foo, Bar, foo, BAR, null, John] keeps insertion order

    }
}
