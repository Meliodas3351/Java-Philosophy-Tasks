package collections.linkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "Luffy", "Zorro","Sanji");
        ListIterator<String> listIterator = arrayList.listIterator();
        System.out.println(arrayList);
        listIterator.next();
        listIterator.add("Usopp");
        listIterator.add("Robin");
        System.out.println(listIterator.next());
        System.out.println(arrayList);

        System.out.println();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Collections.addAll(linkedList,5,4,3);
        System.out.println(linkedList);
        ListIterator<Integer> listIterator2 = linkedList.listIterator();
        listIterator2.next();
        for(int k = 0; k < 5; k++){
            listIterator2.add(random.nextInt(40));
        }
        System.out.println(linkedList);


    }
}
