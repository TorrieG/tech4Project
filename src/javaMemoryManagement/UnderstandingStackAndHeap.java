package javaMemoryManagement;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {


        int age = 45;
        System.out.println(age);

        //reference = object   -> reference(allocated space in memory/blue box) is stored in the heap & object(location to reference)
        // is stored in the stack
        Dog dog1 = new Dog();
        System.out.println(dog1); // location


    }
}
