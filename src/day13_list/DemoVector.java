package day13_list;

import java.util.Vector;

public class DemoVector {
    public static void main(String[] args) {
        //Vector v = new Vector();
        Vector v = new Vector(5121, 10);
        System.out.println("capacity: " + v.capacity());
        System.out.println("size: " + v.size());
        for(int i=1;i<=5121;i++) {
            v.add(i);
        }
        v.add("程咬金");
        System.out.println(v);
        System.out.println("capacity: " + v.capacity());
        System.out.println("size: " + v.size());
    }
}
