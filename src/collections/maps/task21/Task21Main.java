package collections.maps.task21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task21Main {
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
        Map<String, Integer> map = new LinkedHashMap<>();
        for(String s : arrayList){
            map.put(s,map.get(s)==null?1:map.get(s)+1);
        }
        System.out.println(map);
    }
}
