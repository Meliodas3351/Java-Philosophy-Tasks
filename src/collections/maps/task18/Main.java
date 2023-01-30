package collections.maps.task18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Two", 2);
        map.put("Six", 6);
        map.put("Seven", 7);
        map.put("Four", 4);
        map.put("One", 1);
        map.put("Three", 3);

        ArrayList<String> keys = new ArrayList<String>();
        keys.addAll(map.keySet());
        System.out.println(keys);
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.addAll(map.values());

        System.out.println(values.size());
        for (int k = 0; k < values.size() - 1; k++) {
            for (int i = k + 1; i < values.size(); i++) {
                if (values.get(i) < values.get(k)) {
                    System.out.println(k+" - "+i);
                    int j = values.get(i);
                    values.set(i, values.get(k));
                    values.set(k, j);
                    String s = keys.get(i);
                    keys.set(i, keys.get(k));
                    keys.set(k, s);
                    System.out.println(values);
                }
            }
        }
        System.out.println(map);

        map.clear();
        System.out.println(map);
        for (int k = 0; k < keys.size();k++){
            map.put(keys.get(k), values.get(k));
        }
        System.out.println(map);
    }
}
