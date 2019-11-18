package day13_list;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class DemoDict {
    public static void main(String[] args) throws IOException {
        Map<String, String> db = getDataMap();
        
        db.forEach((key, value) -> {
            Scanner sc = new Scanner(System.in);
            System.out.print("題目: " + value + ", 請寫出英文: ");
            String ans = sc.nextLine();
            if(ans.equals(key)) {
                System.out.println("答對了");
            } else {
                System.out.println("答錯了, 應該是: " + key);
            }
        });
    }
    
    public static Map<String, String> getDataMap() throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("src/day13_list/words.txt"));
        String wordsString = new String(bytes);
        String[] rows =wordsString.split("\n");
        Map<String, String> db = new TreeMap();
        for(String row : rows) {
            String[] data = row.split(", ");
            db.put(data[0], data[1]);
        }
        return db;
    }
    
}
