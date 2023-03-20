package strings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestQuantificator {
    public static void main(String[] args) {
        String text = "test test tes5 test test 0";
        Pattern pattern1 = Pattern.compile(".+?\\s");
        Pattern pattern2 = Pattern.compile(".+\\s");
        Pattern pattern3 = Pattern.compile("[^0]++0");
        Matcher matcher = pattern1.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group()+" "+ matcher.start()+" "+matcher.end());
        }
        System.out.println();
        matcher = pattern2.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group()+" "+ matcher.start()+" "+matcher.end());
        }
        System.out.println();

        matcher = pattern3.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group()+" "+ matcher.start()+" "+matcher.end());
        }
        System.out.println();
    }
}
