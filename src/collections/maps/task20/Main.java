package collections.maps.task20;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Character> characterSet = new HashSet<>();
        Collections.addAll(characterSet, 'а', 'о', 'э', 'ы', 'у', 'е', 'ё', 'ю', 'я');
        Map<Character, Integer> map = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово или предложение: ");
        String input = scanner.nextLine();
        char[] array = input.toLowerCase().toCharArray();
        for (char e : array) {
            if (characterSet.contains(e)) {
                map.put(e,map.get(e)==null?1: map.get(e)+1);
            }
        }
        System.out.println(map);
    }
}

