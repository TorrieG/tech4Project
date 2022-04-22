package regex;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        System.out.println("How much wood would a wood-Chuck chuck if a wood-chuck could chuck wood".replaceAll("a", "*"));
        String str = "Hello World";
        System.out.println(str);

        str = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(str);

        System.out.println("Hello123World".replaceAll("[0-9]",""));

        String str3 = " abc 123 $#^ ";
        str3 = str3.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str3);

        System.out.println(" abc 123 $#^ ".replaceAll("[^a-zA-Z0-9]", ""));
    }
}
