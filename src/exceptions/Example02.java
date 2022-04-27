package exceptions;

public class Example02 {
    public static void main(String[] args) {

        int number = 45;
        System.out.println(number / 3);

        try {

            System.out.println(number / 0); //ArithmeticException
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("End of the program!");
    }
}
