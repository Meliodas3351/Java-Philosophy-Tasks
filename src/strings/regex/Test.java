package strings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Test {
    public static void main(String[] args) {
//        String testStr = "Arline ate eight apples and one orange while Ainta hadn't anu";
//
//        Pattern pattern = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
//        Matcher matcher = pattern.matcher(testStr);
//        while (matcher.find()){
//            System.out.println(matcher.group() + '\t' +matcher.start()+'\t'+matcher.end());
//        }

        Pattern pattern1 = Pattern.compile("^Java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher matcher1 = pattern1.matcher("Java has regex\n" + "JaVa has good regular expressions");
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }

    }
}
