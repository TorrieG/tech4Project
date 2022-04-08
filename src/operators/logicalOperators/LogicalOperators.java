package operators.logicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean isIntSent = false;
        boolean isHomeSent = true;

        //Send me int questions or homework
        System.out.println("The student is okay (OR) "+(isIntSent||isHomeSent));
        //if any portion is true it is true
        System.out.println("The student is okay (AND) "+(isIntSent&&isHomeSent));
        //if any portion is false it is false
        System.out.println("The student did NOT sent interview questions "+(!isIntSent));


    }
}
