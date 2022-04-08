package loops.nestedLoops;

public class PrintAllLetters {
    public static void main(String[] args) {


        for (int i = 1; i <= 2; i++) {
            int start = 97;
            if (i == 1){
                // First iteration
                System.out.println("\nLowercase Letters");
            }
            else{
                // Second iteration
                System.out.println("\n\nUppercase Letters");
                start = 65;
            }
            for (int j = start; j <= start+25; j++) {
                System.out.print((char)j+" ");
            }

    }  System.out.println("\n\n-----Separate Loops Solution-----\n");

        System.out.println("Lowercase letters");
        for (int i = 97; i <= 122; i++) {
            System.out.println((char)i);
        }

        System.out.println("Uppercase letters");
        for (int i = 65; i <= 90; i++) {
            System.out.println((char)i);
        }

        System.out.println("End of the program!");
    }
}

