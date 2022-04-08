package loops.doWhileLoop;

import java.util.Random;

public class UnderstandingDoWhileLoop {
    public static void main(String[] args) {
        Random random = new Random();
        boolean b = random.nextBoolean();

        do{
            System.out.println("true");

        }while (b);
    }
}
