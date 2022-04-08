package casting;

public class ExplicitCastingProblem {
    public static void main(String[] args) {
        int number = 150;//spills over and restarts at the min data will be lost
        byte b = (byte) number;
        System.out.println(b);
    }
}
