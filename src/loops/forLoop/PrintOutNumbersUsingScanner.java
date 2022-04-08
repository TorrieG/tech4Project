package loops.forLoop;

import utilities.ScannerHelper;

public class PrintOutNumbersUsingScanner {
    public static void main(String[] args) {

        int num = ScannerHelper.getNumberFromUser();

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1) System.out.println(i);
    }

}
}
