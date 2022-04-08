package projects;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

        System.out.println("TASK-01");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        int number1 = input.nextInt(), number2 = input.nextInt(), number3 = input.nextInt();
        System.out.println("The product of the numbers entered is = "+ (number1*number2*number3));

        System.out.println("\nTASK-02");
        System.out.println("What is your first name?");
        String firstName= input.next();
        System.out.println("What is your last name?");
        String lastName = input.next();
        System.out.println("What is your year of birth?");
        int yearOfBirth= input.nextInt(), currentYear=2022;
        System.out.println(firstName+" "+lastName+"'s age is = "+(currentYear-yearOfBirth)+".");
        input.nextLine();

        System.out.println("\nTASK-03");
        System.out.println("What is yur full name?");
        String fullName = input.nextLine();

        System.out.println("What is your weight?");
        double kgWeight = input.nextDouble();
        System.out.println(fullName+"'s weight is = "+(kgWeight*2.205)+" lbs.");
        input.nextLine();

        System.out.println("\nTASK-04");
        System.out.println("What is your full name?");
        String fullName1 = input.nextLine();
        System.out.println("What is your age?");
        int age1 = input.nextInt();
        System.out.println("What is your full name?");
        String fullName2 = input.nextLine();
        input.nextLine();
        System.out.println("What is your age?");
        int age2 = input.nextInt();
        System.out.println("What is your full name?");
        String fullName3 = input.nextLine();
        input.nextLine();
        System.out.println("What is your age?");
        int age3 = input.nextInt();
        input.nextLine();
        System.out.println(fullName1+"'s age is "+age1+"."+
                "\n"+fullName2+"'s age is "+age2+"."+
                "\n"+fullName3+"'s age is "+age3+"."+
                "\nThe average age is "+((age1+age2+age3)/3)+"."+
                "\nThe eldest age is "+Math.max(Math.max(age1,age2),age3)+"."+
                "\nThe youngest age is "+Math.min(Math.min(age1,age2),age3)+"."
        );




    }
}
