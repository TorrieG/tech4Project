package characterClass;

public class UnderstandingCharacterClass {
    public static void main(String[] args) {


        boolean b = Character.isDigit('9');

        System.out.println(b);

        System.out.println(Character.isDigit('9')); // quick and easy ;) // true

        System.out.println(Character.isUpperCase('a')); // false
        System.out.println(Character.isLowerCase('l')); // true

        System.out.println(Character.isLetterOrDigit('5')); // true
        System.out.println(Character.isLetterOrDigit('w')); // true

        System.out.println(Character.isWhitespace(' ')); // true
        System.out.println(Character.isSpaceChar(' ')); // true

        char c2 = '_';
        System.out.println(!Character.isLetterOrDigit(c2) && !Character.isSpaceChar(c2)); // true

        char c3 = 'A';
        String s = "AEIOUaeiou";
        System.out.println(s.contains("" + c3)); // true
        System.out.println(s.contains(String.valueOf(c3)));

        char c4 = 'a';
        boolean isC4Vowel = false; // raise a flag OR int flag
        int sum = 0;


        for (int i = 0; i < s.length(); i++) {
            if (c4 == s.charAt(i)){
                isC4Vowel = true;
                break;
            }
        }

    }
}
