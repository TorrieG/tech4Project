package operators.incrementAndDecrement;

public class PreincrementAndPostincrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
       /*
        a*=1;

        */
        a++;//post waiting for next a
        System.out.println(a);
        ++a;//pre adding 1 immediately
        System.out.println(a);
    }
}
