package day11_set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        while(set.size() < 5) {
            set.add(new Random().nextInt(39) + 1);
        }
        System.out.println(set.size());
        System.out.println(set);
    }
}
