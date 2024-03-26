package RegularExpression;

import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarness {

    public static void main(String[] args){
        Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        while (true) {

            Pattern pattern = 
            Pattern.compile(console.readLine("%nEnter your regex: "));

            Matcher matcher = 
            pattern.matcher(console.readLine("Enter input string to search: "));

            boolean found = false;
            while (matcher.find()) {
                console.format("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
                console.format("No match found.%n");
            }
        }
    }
}

//while the input string is 3 characters long, the start index is 0 and the end index is 3. By convention, ranges are inclusive of the beginning index and exclusive of the end index.
//For reference: https://docs.oracle.com/javase/tutorial/essential/regex/literals.html
//Metacharaters:  <([{\^-=$!|]})?*+.>


// There are two ways to force a metacharacter to be treated as an ordinary character:
// precede the metacharacter with a backslash, or
// enclose it within \Q (which starts the quote) and \E (which ends it).
// When using this technique, the \Q and \E can be placed at any location within the expression, provided that the \Q comes first.