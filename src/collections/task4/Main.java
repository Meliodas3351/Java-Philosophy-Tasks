package collections.task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        class InnerCollections {
            public ArrayList<String> arrayList;
            public LinkedList<String> linkedList;
            public HashSet<String> hashSet;
            public LinkedHashSet<String> linkedHashSet;
            public TreeSet<String> treeSet;

            public InnerCollections() {

                arrayList = new ArrayList<String>();
                arrayList.add("Luffy");
                arrayList.add("Zoro");
                arrayList.add("Sunji");
                arrayList.add("Nami");
                arrayList.add("Nico Robin");
                arrayList.add("Usopp");
                arrayList.add("Chopper");
                arrayList.add("Franky");
                arrayList.add("Brook");
                arrayList.add("Jimbey");

                linkedList = new LinkedList<>();
                linkedList.addAll(arrayList);

                hashSet = new HashSet<>();
                hashSet.addAll(arrayList);

                linkedHashSet = new LinkedHashSet<>();
                linkedHashSet.addAll(arrayList);

                treeSet = new TreeSet<>();
                treeSet.addAll(arrayList);

            }
        }

        InnerCollections innerCollections = new InnerCollections();
        System.out.println(innerCollections.arrayList);
        System.out.println(innerCollections.linkedList);
        System.out.println(innerCollections.hashSet);
        System.out.println(innerCollections.linkedHashSet);
        System.out.println(innerCollections.treeSet);

        System.out.println(innerCollections.treeSet.first());
    }
}
