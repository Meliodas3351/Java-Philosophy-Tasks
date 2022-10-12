package collections.task2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int counter = 0;
        Set<Integer> set = new HashSet<>();
        int r = random.nextInt(500);
        System.out.println(r);
        for (int k = 0; k < r; k++) {
            counter++;
            set.add(random.nextInt(40));
        }
        for (Integer c : set) {
            System.out.println(c);
        }
        System.out.println(counter + " " + set.size());
    }
}
