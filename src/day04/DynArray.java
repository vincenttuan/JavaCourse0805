package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DynArray {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++) {
            list.add(new Random().nextInt(100));
        }
        System.out.println(list);
        System.out.println("index = 1 => " + list.get(1));
        System.out.println("size : " + list.size());
        
        // 排序 小->大
        Collections.sort(list);
        System.out.println("排序 小->大: " + list);
        
        // 反轉
        Collections.reverse(list);
        System.out.println("反轉: " + list);
        
        // 洗牌
        Collections.shuffle(list);
        System.out.println(list);
        
        // 最大/小值
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("max: " + max + ", min: " + min);
        
        
    }
}
