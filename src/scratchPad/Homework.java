package scratchPad;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n8;
        int sum8 = 0;
        System.out.println("Please enter a number");
        n8 = input.nextInt();
        if (n8 >= 100 && sum8 == 0){
            System.out.println("This number is already more than 100");
        }else{
            while (sum8 <= 100){
                sum8 += n8;
                if (sum8 >= 100) break;
                System.out.println("Please enter a number");
                n8 = input.nextInt();



            }}
    }
}
