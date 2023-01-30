package collections.listIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(5);
        ArrayList<String> list2 = new ArrayList<>(5);

        Collections.addAll(list1, "Luffy", "Zoro", "Nami", "Ace", "Fujitora");
        list2.addAll(list1);


        ListIterator<String> listIterator1 = list1.listIterator();
        ListIterator<String> listIterator2 = list2.listIterator();

        System.out.println(list1.size());

        while (listIterator2.hasNext()) {
            listIterator2.next();
        }

        while (listIterator1.hasNext()) {
            listIterator2.previous();
            listIterator2.set(listIterator1.next());
        }

        listIterator1 = list1.listIterator();
        listIterator2 = list2.listIterator();

        while (listIterator1.hasNext()) {
            System.out.println(listIterator1.next());
        }

        System.out.println();
        while (listIterator2.hasNext()) {
            System.out.println(listIterator2.next());
        }

        list1.add(null);
        System.out.println(list1.size());
    }
}
