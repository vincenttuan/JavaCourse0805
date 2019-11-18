package day13_list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) throws InterruptedException {
        Stack<String> s = new Stack();
        s.push("1");
        s.push("2");
        s.push("3");
        System.out.println(s);
        
        System.out.println("發射");
        while (!s.isEmpty()) {            
            System.out.printf("發射第 %s 發\n", s.pop());
            Thread.sleep(2000);
        }
        System.out.println("發射完畢");
        System.out.println(s);
    }
}
