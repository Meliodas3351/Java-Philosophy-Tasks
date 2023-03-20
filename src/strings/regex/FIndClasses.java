package strings.regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FIndClasses {
    public static void main(String[] args) {
        File[] files = new File("src/strings/regex").listFiles();
        System.out.println(files.length);
        ArrayList<String> classes = new ArrayList<>();
        Pattern pattern = Pattern.compile("class\\s+(\\w+)\\s+");
        for(File file : files){
            try {
                Scanner scanner = new Scanner(file);
                String res = "";
                while (scanner.hasNextLine()){
                    res+=scanner.nextLine()+'\n';
                }
                Matcher matcher = pattern.matcher(res);
                while (matcher.find()){
                    classes.add(matcher.group(1));
                }

            }catch (FileNotFoundException e){

            }

        }
        System.out.println(classes);
    }
}
