package RegularExpression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternAndMacher {
    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher("hello");

        boolean found = matcher.find();

        System.out.println("found: "+ found);
    }
}
