package operators.relationalOperators;

public class RelationalOperators {
    public static void main(String[] args) {

        int a=4;
        int b=10;


        boolean isAEqualToB = a==b;
        boolean isANotEqualToB = a!=b;
        System.out.println("a=b: "+isAEqualToB);
        System.out.println("a!=: "+isANotEqualToB);

        boolean isAGreaterThanB = a>b;
        boolean isALessThanB = a<b;
        boolean isAGreaterOrEqualThanB = a>=b;
        boolean isALessThanOrEqualB = a<=b;
        System.out.println("a>b "+isAGreaterThanB);
        System.out.println("a<b "+isALessThanOrEqualB);
        System.out.println("a>=b "+isAGreaterOrEqualThanB);
        System.out.println("a<=b "+isALessThanOrEqualB);




    }
}
