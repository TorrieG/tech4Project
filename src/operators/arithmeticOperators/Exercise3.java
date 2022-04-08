package operators.arithmeticOperators;

public class Exercise3 {
    public static void main(String[] args) {
        /*

         */

        double week = 52;
        double year = 12;
        double biWeekly = 26;
        double annual =90_000.00;

        System.out.println("Monthly Salary = $"+(annual/year));
        System.out.println("Bi-weekly Salary = $"+(annual/biWeekly));
        System.out.println("Weekly Salary = $"+(annual/week));
    }
}
