package loops;

import utilities.ScannerHelper;

public class ReverseString {
    public static void main(String[] args) {

        String name = ScannerHelper.getANameFromUser();

        String revName = "";
        for (int i = (name.length()-1); i >= 0; i--) {
            revName += name.charAt(i);


        }
        System.out.println("Reverse name = "+revName);

    }

}
