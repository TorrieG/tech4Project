package stringMethods;

public class _13_replace {
    public static void main(String[] args) {
        /*
        Method Task: It is used to replace some values in a String with another value
        NOTE: it replaces all the occurrences.
        -it is non-static
        -it is a return type and returns another which is modified
        -it takes 2 arguments (char or String)
         */

        String sentence = "Can I can a can?";

        System.out.println(sentence.replace("can","xxx"));

        String s = "banana";

        System.out.println(s.replace('a','$'));
    }
}
