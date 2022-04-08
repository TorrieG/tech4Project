package casting;

import java.util.Scanner;

public class ConvertingPrimitivesToString {
    public static void main(String[] args) {

        /*
        Write a program ask user for 5 of their grades as strings
        print out their avg
        Input: "45" "50" "55" "60" "65"
        Output: 55
         */

        /*
        Write a program that asks users their balance as
        a string and asks for 3 transactions as string end
        print out the end result as double.


        Input:
"What is your balance?"
user:
456.7

"What is your next 3 transactions?
user:
34.1
65.3
28.4

Output:
"Your balance is now = x"
         */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your 5 grades:");
//        System.out.println(
//                (int)((Double.parseDouble(input.next()) +
//                        Double.parseDouble(input.next()) +
//                        Double.parseDouble(input.next()) +
//                        Double.parseDouble(input.next()) +
//                        Double.parseDouble(input.next())) / 5)
//        );

        /*
         Write a program that asks users their balance as
        a string and asks for 3 transactions as string end
        print out the end result as double.
        Input:
        "What is your balance?"
        user:
        456.7
        "What is your next 3 transactions?
        user:
        34.1
        65.3
        28.4
        Output:
        "Your balance is now = 328.9"
         */

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance?");
        String balance = input.next();
        System.out.println("What is your next 3 transactions");
        String t1 = input.next(), t2 = input.next(), t3 = input.next();
        Double balanceD = Double.valueOf(balance);
        Double t1D = Double.valueOf(t1);
        Double t2D = Double.valueOf(t2);
        Double t3D = Double.valueOf(t3);
        System.out.println(
                "Your balance is now = " + (balanceD - t1D - t2D - t3D)
        );
         */

        /*
        Scanner input = new Scanner(System.in);

        System.out.println("What is your balance?");
        String balance = input.next();

        System.out.println("What is your next 3 transactions");

        System.out.println(
                "Your balance is now = " + (Double.valueOf(balance)
                        - Double.valueOf(input.next())
                        - Double.valueOf(input.next())
                        - Double.valueOf(input.next()))
        );
         */

        Scanner input=new Scanner(System.in);

        /*
        Write a program ASK user for full name, age, phone number and then
enter their 3 kids age as string then print out everything plus
the oldest kid, youngest and the age difference between oldest
and youngest.

Program: "Please enter your name"
User: John Doe
Program: "Please enter your age:
User: 45
Program: "Please enter your phone number:
User: (123) 123 1234
Program: "Enter the ages of your kids"
User:
12
22
17
Program:
Your name is John Doe, your phone number is (123) 123 1234,
You are 45 years old, Your oldest kid is 22 years old, your
youngest is 12, difference between oldest and youngest is 10
years.
         */

        System.out.println("Please enter your full name");
        String fullName=input.nextLine();

        System.out.println("Please enter your age");
        String age=input.next();
        input.nextLine();//clear spaces
        System.out.println("Please enter your phone number");
        String phoneNumber=input.nextLine();
        System.out.println("Please enter the ages of your kids");
        String age1=input.next(), age2=input.next(), age3= input.next();

        int age1Int = Integer.parseInt(age1), age2Int = Integer.parseInt(age2), age3Int = Integer.parseInt(age3);

        /*
        Your name is John Doe, your phone number is (123) 123 1234,
        You are 45 years old, Your oldest kid is 22 years old, your
        youngest is 12, difference between oldest and youngest is 10
        years
         */

        int oldestKid = Math.max(age3Int,Math.max(age1Int, age2Int));
        int youngestKid = Math.min(age3Int,Math.min(age1Int, age2Int));

        int ageDifference = Math.abs(oldestKid-youngestKid);


        System.out.println("Your name is "+fullName+", your phone number is "+ phoneNumber +
                ", \nYou are " + age + " years old. Your oldest kid is "+ oldestKid+" years old, your"+
                "\nyoungest is "+youngestKid+ ", difference between oldest and youngest is "+ageDifference+
                "\nyears.");





        int num =36;
        //+(concatenation)
        //valueOf()

        String numStr1 = num + "";
        String numStr2= String.valueOf(num+45);

        System.out.println("numStr1 = " + numStr1);
        System.out.println("numStr2 = "+numStr2);

    }
}
