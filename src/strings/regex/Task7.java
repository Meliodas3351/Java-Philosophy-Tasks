package strings.regex;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args){
        String englishTest = "one the to the trrr you";
        String text = "Топредложениеначинаетсясбольш ойбуквыизаканчиваетсяточкой.";
        System.out.println(text.matches("[А-Я][А-Я а-я]+."));
        System.out.println(Arrays.toString(englishTest.split("you|the")));
        System.out.println(text.replaceAll("[уеёыаоэяиюЁУЕЫАОЭЯИЮ]","_"));
    }
}
