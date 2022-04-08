package ifElseStatements.ifElseIfStatement;

public class Exercise1 {
    public static void main(String[] args) {


        //
        int num = (int)(Math.random()*21)+(-10);
        System.out.println(num);
        if(num > 0){
            System.out.println("number is POSITIVE!");
        }else if(num < 0){
            System.out.println("number is NEGATIVE!");
        }else {
            System.out.println("number is ZERO!");

        }

    }
}
