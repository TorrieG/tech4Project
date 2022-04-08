package operators.shortHandAssignmentOperators;

public class Exercise1 {
    public static void main(String[] args) {

        /*
        Create 2 int variables
        int a = 8, b = 3; Then, find their sum, subtraction,
        multiplication, division and remainder by using
        shorthand operators, and assign those values into a
         */

        int a = 8, b=3;

        System.out.println((a+=b));
        System.out.println((a-=b));
        System.out.println((a*=b));
        System.out.println((a/=b));
        System.out.println((a%=b));


    }
}
