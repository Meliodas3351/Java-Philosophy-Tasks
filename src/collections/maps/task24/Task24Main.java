package collections.maps.task24;

import java.util.*;

public class Task24Main {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, Integer> map = new HashMap<>();
        Random random = new Random();

        for(int k = 0;k < 100;k++){
            int n = random.nextInt(20);
            map.put(n,map.get(n)==null?1:map.get(n)+1);
        }
        ArrayList<Map.Entry<Integer,Integer>> arrayList = new ArrayList<>(map.entrySet());
        System.out.println(arrayList);
        Collections.sort(arrayList, new Comparator<Map.Entry<Integer,Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println(arrayList);
    }
}
