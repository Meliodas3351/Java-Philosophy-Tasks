package collections.maps.task17;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);
            map.put(r,map.get(r)==null?1:map.get(r)+1);
        }
        System.out.println(map);
    }
}
