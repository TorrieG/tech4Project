package javaMemoryManagement;

public class StringExample {
    public static void main(String[] args) {

        //First way to create String
        String name1 = "John"; // in a String Pool

        //Second way to create string
        String name2 = new String("Alex");// in the Heap with the String value


        String name3 = "Alex";
        String name4 = "John";

        System.out.println(name1 == name4);
        System.out.println(name2 == name3);

        for (int i = 0; i < 1000; i++) {
            String name = "Torrie"; //will create 1 in the stack
            String name7 = new String("Torrie"); //will create 1000 in the heap
        }
    }
}
