package utilities;

public class Counting {

    //
    public static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }


    public int roundSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);
    }

    public int round10(int num){
        if (num % 10 >= 5)return num + 10 -(num % 10);
        else return num - (num % 10);
    }
    public static int countDigitsFromUser() {
        int count = 0;
        String string = ScannerHelper.getAStringFromUser();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public static int countLettersFromUser() {
        int count = 0;
        String sentence = ScannerHelper.getAStringFromUser();
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public static int countSpacesFromUser() {
        int count = 0;
        String str = ScannerHelper.getAStringFromUser();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
    public static int countUpperCases(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }return count;
    }
    public static int countLowerCases(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))) count++;
        }
        return count;
    }
    public static int countSpecials(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char a = str.charAt(i);
            if(!Character.isLetterOrDigit(a) && !Character.isWhitespace(a)) count++;
        }
        return count;
    }

}


