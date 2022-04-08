package casting;

public class ExerciseConvertingDataTypes {
    public static void main(String[] args) {

        /*
        Write a program which will take two numbers as a STRING and get the avg
        of them and print it out

        Input:
        String num1 = "23";
        String num2 = "25";

       Output:
       24
         */

        String num1 = "23";
        String num2 = "25";
        int num1Int =Integer.valueOf(num1);
        int num2Int =Integer.valueOf(num2);

        Integer number = Integer.parseInt(num1);
        Integer number2 = Integer.parseInt(num2);

        System.out.println("Avg with int is = " + (num1Int+num2Int)/2);
        System.out.println("Avg with Integer is = "+(number+number2)/2);

        /*
Assume David is going to save  $390 to buy a bicycle.
David can save only $15.60 per day. How many days later,
David can save $390 and buy the bicycle.

Requirement:
Write a java program to solve this problem given above

Input:
String save = 390;
String day = 15.60;

Expected Output:
25
 */
        String save ="390";
        String day = "15.60";
        double save1 = Double.valueOf(save);
        double day1 = Double.valueOf(day);
        System.out.println((int)(save1/day1));





    }
}
