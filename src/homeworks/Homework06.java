package homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("TASK-1");
        String s1 = "5", s2="10";
        int sInt1 = Integer.parseInt(s1);
        int sInt2 = Integer.parseInt(s2);
        System.out.println("-Sum of "+sInt1+" and "+sInt2+" is = "+(sInt1+sInt2)+
                "\n-Product of "+sInt1+" and "+sInt2+" is = "+(sInt1*sInt2)+
                "\n-Division of "+sInt1+" and "+sInt2+" is = "+(sInt1/sInt2)+
                "\n-Subtraction of "+sInt1+" and "+sInt2+" is = "+(sInt1-sInt2)+
                "\n-Remainder of "+sInt1+" and "+sInt2+" is = "+(sInt1%sInt2)
                );

        System.out.println("\nTASK-2");
        String num1 ="200", num2 = "-50";
        int numInt1 = Integer.parseInt(num1), numInt2 = Integer.parseInt(num2);
        System.out.println("The greatest value is = "+(Math.max(numInt1,numInt2))+
                "\nThe smallest value is = "+(Math.min(numInt1,numInt2))+
                "\nThe average is = "+(numInt1+numInt2)/2+
                "\nThe absolute difference is = "+(Math.abs((numInt1-numInt2)))
                );

        System.out.println("\nTASK-3");
        double quarters = .75, dimes = .1, nickels = .10, pennies = .01;
        double daily = (quarters+dimes+nickels+pennies);
        System.out.println((int)(24/daily)+" days"+
                "\n"+(int)(168/daily)+" days"+
                "\n$"+(daily*150)
                );

        System.out.println("\nTASK-4");
        double goal = 1250,  eachDay = 62.5;
        System.out.println((int)(goal/eachDay));

        System.out.println("\nTASK-5");
        double savings=14_265, option1=475.5, option2=951;
        System.out.println("Option 1 will take "+((int)(savings/option1))+" months"+
                "\nOption 2 will take "+((int)(savings/option2))+" months"
                );

        System.out.println("\nTASK-6");
        Scanner results = new Scanner(System.in);
        System.out.println("Pleas enter 2 numbers");
        System.out.println(((double)(results.nextInt())/((double) results.nextInt())));


    }
}
