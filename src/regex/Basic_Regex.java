package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_Regex {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("lo");
        Matcher match = pat.matcher("I love TechGlobal");

        System.out.println(match.matches());

        while (match.find()){
            System.out.println(match.start());
            System.out.println(match.end());
            
        }
    }
}
