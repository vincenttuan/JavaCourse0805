package day13_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_vs_LinkedHashMap {
    public static void main(String[] args) {
        Map hashMap = new HashMap(); // 無序集合
        hashMap.put(100, "A");
        hashMap.put(300, "B");
        hashMap.put(200, "C");
        System.out.println(hashMap);
        
        Map linkedHashMap = new LinkedHashMap(); // 有序集合
        linkedHashMap.put(100, "A");
        linkedHashMap.put(300, "B");
        linkedHashMap.put(200, "C");
        System.out.println(linkedHashMap);
        
        Map treeMap = new TreeMap(); // 有順序集合
        treeMap.put(100, "A");
        treeMap.put(300, "B");
        treeMap.put(200, "C");
        System.out.println(treeMap);
    }
}
