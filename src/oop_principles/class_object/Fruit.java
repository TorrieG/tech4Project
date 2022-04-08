package oop_principles.class_object;

public class Fruit {

    // Instance variables
    public static boolean hasColor;

    static{ // static block
        hasColor = true;
    }
    public String  name;
    public String shape;
    public boolean isSweet;

    { // instance block
        name = "Unknown";
        shape = "Round";
        isSweet = true;
    }


    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        System.out.println(Fruit.hasColor);
        System.out.println(fruit1.name);
        System.out.println(fruit1.shape);
        System.out.println(fruit1.isSweet);


    }
}
