package by.itacademy.courses.hw9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {

    public static String search(String a) {
        String symbol = null;
        Pattern pattern = Pattern.compile("[-+/*]");
        Matcher matcher = pattern.matcher(a);
        while (matcher.find()) {
            symbol = a.substring(matcher.start(), matcher.end());
        }
        return symbol;

    }

    public static String[] splitText(String text) {
        return text.split("\\s*[+\\-/*]\\s*");
    }
}
