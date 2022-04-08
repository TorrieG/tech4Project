package mathClass;

public class FindMin {
    public static void main(String[] args) {

        int x=45;
        int y=12;
        int z=65;

        int a=123;
        int b=-123;

        int minXY = Math.min (y,x);
        int minZA = Math.min(z,a);
        int minZAB = Math.min(minZA,b);
        int minAll = Math.min(minZAB, minXY);

    }
}
