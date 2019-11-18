package day12_treeset;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        while(set.size() < 5) {
            set.add(new Random().nextInt(39) + 1);
        }
        System.out.println(set.size());
        System.out.println(set);
    }
}
