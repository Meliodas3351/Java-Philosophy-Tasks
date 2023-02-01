package collections.maps.task22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task22Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/collections/files/example21.txt"));
        ArrayList<String> arrayList = new ArrayList<>();
        while(scanner.hasNextLine()){
            String currentLine = scanner.nextLine().toUpperCase();
            currentLine = currentLine.replaceAll("\\.","");
            currentLine = currentLine.replaceAll(",","");
            currentLine = currentLine.replaceAll("  "," ");
            arrayList.add(currentLine);
        }
        int currentSize = arrayList.size();
        for(int k = 0; k < currentSize;k++){
            arrayList.addAll(Arrays.stream(arrayList.get(0).split(" ")).toList());
            arrayList.remove(arrayList.get(0));

        }
        Collections.sort(arrayList,String.CASE_INSENSITIVE_ORDER);
        System.out.println(arrayList);
        Set<Storage> storages = new HashSet<>();
        for(String s : arrayList){
            boolean result = false;
            for(Storage storage : storages){
                if(storage.getString().equals(s)){
                    storage.setCounter(storage.getCounter()+1);
                    result = true;
                }
            }
            if(!result){
                storages.add(new Storage(s, 1));
            }
        }
        for (Storage storage : storages){
            System.out.println(storage);
        }
    }
}
class Storage{
    private String string;
    private int counter;

    public Storage(String string, int counter) {
        this.string = string;
        this.counter = counter;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "string = " + string +
                ", count = " + counter;
    }
}
