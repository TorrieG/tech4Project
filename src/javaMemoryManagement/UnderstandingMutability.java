package javaMemoryManagement;

public class UnderstandingMutability {
    public static void main(String[] args) {

        String city = "Chicago";
        String address = "Chicago";

        System.out.println(city == address); // true but not proper usage. it checks both locations which is the same
        System.out.println(city.equals(address));

    }
}
