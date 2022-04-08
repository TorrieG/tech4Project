package scanner;
import java.util.Scanner;
public class LearningScannerMultipleLines {

    public static void main(String[] args){


        //DataType/ClassName variableName = new DataType/ClassName(()if they are needed);--> creating an object
        Scanner inputReader =new Scanner(System.in);

        System.out.println("What is your address");
        String userAddress = "\""+inputReader.nextLine()+"\"";  //variableName.methodName();

        System.out.println("User address = ".concat(userAddress));


    }



}
