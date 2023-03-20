package strings.regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Flags {
    public static void main(String[] args)  {
        File[] files = new File("src/strings/regex.").listFiles();
        for(File file : files){
            System.out.println(file.getName());
        }
//test
        if(files.length!=0){
            try {
                //comment
                Scanner scanner = new Scanner(files[0]);
                String result = "";
                while (scanner.hasNextLine()){
                    result+= scanner.nextLine()+'\n';
                }
                //System.out.println(result);
                Pattern pattern = Pattern.compile("\n\\s*(//.+)",Pattern.UNIX_LINES);
                Matcher matcher = pattern.matcher(result);
                while (matcher.find()){
                    System.out.println(matcher.group(1));
                }
            }catch (FileNotFoundException e){

            }

        }

    }
}
