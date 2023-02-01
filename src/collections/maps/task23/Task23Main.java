package collections.maps.task23;

import interfaces.usingAbstractMethodsInConstructors.Person;

import java.util.*;

public class Task23Main {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, Integer> map = new HashMap<>();
        Random random = new Random();

        while (true){
            System.out.println("Step");
            int n = random.nextInt(20);
            map.put(n,map.get(n)==null?1:map.get(n)+1);
            int counter = 0;
            int count = map.get(n);
            int currentMax = 0;
            int maxCount = 0;
            Set<Integer> keys = map.keySet();
            for(Integer key : keys) {
                if(count>map.get(key)){
                    counter++;
                }
                if(map.get(key)>maxCount){
                    currentMax = key;
                    maxCount = map.get(key);
                }
            }

            System.out.println("Число "+n +" появляется чаще чем "+Math.round((double) counter/map.size()*100)+"%, количество вхождений - "+ count);
            System.out.println("Наиболее часто встречающееся число - "+currentMax);
            Thread.sleep(200);
        }
    }
}
