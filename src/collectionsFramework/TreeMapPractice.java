package collectionsFramework;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        TreeMap<String,Integer> studentAges = new TreeMap<>();
        studentAges.put("Kaly",17);
        studentAges.put("Torrie",45);
        studentAges.put("Alona", 15);
        studentAges.put("Andrei", 25);
        //studentAges.put(null, 25); // NullPointerException no nulls


        System.out.println(studentAges); //{Alona=15, Andrei=25, Kaly=17, Torrie=45} sorted
    }
}
