package utilities;

public class CharacterHelper {


    //TASK-1

    public static boolean isSpace(char space) {
        return space == ' ';
    }

    //TASK-2
    public static boolean isDigit(char digit) {
        return digit >= 48 && digit <= 57;
    }

    //TASK-3
    public static boolean isUppercase(char letter) {
        return letter >= 'A' && letter <= 'Z';
    }

    //TASK-4
    public static boolean isLowercase(char letter) {
        return letter >= 'a' && letter <= 'z';
    }

    //TASK-5
    public static boolean isLetter(char letter) {
        return isLowercase(letter) || isUppercase(letter);
    }

    //TASK-6
    public static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U';
    }

    //TASK-7
    public static boolean isConsonant(char letter) {
        return !isVowel(letter) && isLetter(letter);
    }


}
