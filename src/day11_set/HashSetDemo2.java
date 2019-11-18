package day11_set;

import day11_equals.Pen;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetDemo2 {
    public static void main(String[] args) {
        Pen p1 = new Pen("Red", 200);
        Pen p2 = new Pen("Blue", 200);
        Pen p3 = new Pen("Blue", 200);
        Set set = new HashSet();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
