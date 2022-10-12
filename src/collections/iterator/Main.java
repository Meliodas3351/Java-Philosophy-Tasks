package collections.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String args[]) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "Luffy", "Zoro", "Nami");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String actionString = iterator.next();
            System.out.println(actionString);
            iterator.remove();

        }
        System.out.println(arrayList.size());
        iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String actionString = iterator.next();
            System.out.println(actionString);
        }
    }
}
