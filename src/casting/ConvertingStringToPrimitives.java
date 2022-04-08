package casting;

public class ConvertingStringToPrimitives {
    public static void main(String[] args) {

        String num1 = "23";
        String num2 = "12";
        //23+12=35
        int num1Int=Integer.parseInt(num1);//parseInt() returns primitive
        int num2Int=Integer.parseInt(num2);//String --> int
        System.out.println(num1Int+num2Int);

        Integer num1Integer =Integer.valueOf(num1);//valueOf() returns wrapper Class
        Integer num2Integer =Integer.valueOf(num2);//String --> Integer

        int num1IntValueOf =Integer.valueOf(num1);//String --> Integer --> int

        System.out.println(num1Integer+num2Integer);


    }


}
