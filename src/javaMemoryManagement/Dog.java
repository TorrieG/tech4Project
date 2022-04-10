package javaMemoryManagement;

public class Dog {
    public String breed;
    public int age;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("A dog object is garbage collected");

    }
}
