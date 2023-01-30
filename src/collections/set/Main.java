package collections.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Character> characterSet = new HashSet<>();
        Collections.addAll(characterSet, 'а', 'о', 'э', 'ы', 'у', 'е', 'ё', 'ю', 'я');
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово или предложение: ");
        String input = scanner.nextLine();
        int counter = 0;
        char[] array = input.toLowerCase().toCharArray();
        for (char e : array) {
            if (characterSet.contains(e)) {
                counter++;
            }
        }
        System.out.println("В вашем предложении " + counter + " гласных.");
    }
}