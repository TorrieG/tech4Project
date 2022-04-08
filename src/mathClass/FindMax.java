package mathClass;

public class FindMax {
    public static void main(String[] args) {

        int x=8;
        int y=20;
        int z=12_345;
        int a=34, b=123;

        int maxValue = Math.max(x,y);
        int maxValue2 = Math.max('a',y);//char can be used as well
        int maxValueXYZ = Math.max(maxValue,z);
        int maxValueAB = Math.max(a,b);
        int maxOfAll = Math.max(maxValueAB,maxValueXYZ);
        System.out.println(maxValue);
        System.out.println(maxValue2);
        System.out.println("max of all = "+maxOfAll);

    }
}
