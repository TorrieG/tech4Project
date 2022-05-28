package collectionsFramework;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {

        System.out.println("\nUnderstanding Map\n");
        HashMap<String,String> capitals = new HashMap<>();
        capitals.put("Ukraine", "Kiev");
        capitals.put("Spain", "Madrid");
        capitals.put("Portugal", "Lisbon");
        capitals.put("Italy", "Roma");
        capitals.put("US", "DC");
        capitals.put("Canada", "Ottawa");
        capitals.put(null, "Ottawa");

        System.out.println(capitals);//{Canada=Ottawa, Ukraine=Kiev, Italy=Roma, Portugal=Lisbon, US=DC, Spain=Madrid}

        System.out.println(capitals.get("Spain"));

        System.out.println("\nUnderstanding HashMap\n");
        HashMap<Integer, String> students = new HashMap<>();
        students.put(20, "Alona");
        students.put(2, "Abdullah");
        students.put(3, "Abdullah");
        students.put(23, "Data");
        students.put(null, "John");
        students.put(null, "Alex");// This will replace John with Alex because keys must be unique
        students.put(5, null);
        students.put(6, null);
        students.put(7, null);
        students.put(4, null);

        System.out.println(students.size());
        System.out.println(students);// doesn't keep insertion order


    }
}
