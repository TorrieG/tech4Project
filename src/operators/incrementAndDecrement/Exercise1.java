package operators.incrementAndDecrement;

public class Exercise1 {
    public static void main(String[] args) {
        int i =5;
        int age = 10*(i++);//post
        System.out.println(age);

        age= 10*i;//this is the next time it was called
        System.out.println(age);




    }
}
