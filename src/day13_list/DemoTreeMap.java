package day13_list;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("src/day13_list/words.txt"));
        //System.out.println(bytes.length);
        String wordsString = new String(bytes);
        //System.out.println(wordsString);
        String[] rows =wordsString.split("\n");
        Map<String, String> db = new TreeMap();
        for(String row : rows) {
            String[] data = row.split(", ");
            //System.out.printf("\"%s\", key=%s, value=%s\n", row, data[0], data[1]);
            db.put(data[0], data[1]);
        }
        System.out.println(db);
        System.out.println(db.get("action"));
    }
    
}
