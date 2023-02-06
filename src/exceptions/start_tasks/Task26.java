package exceptions.start_tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.text.ParseException;

public class Task26 {
    public static void main(String[] args) {
        try {
            parseNumber("sss");
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Конец программы.");
    }

    public static void parseNumber(String str) throws ParseException {
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.parse(str));
    }
}
