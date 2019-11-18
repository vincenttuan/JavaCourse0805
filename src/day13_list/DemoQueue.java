package day13_list;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) throws InterruptedException {
        Queue<String> q = new LinkedList();
        q.offer("吃早餐");
        q.offer("寫程式");
        q.offer("寫報告");
        q.offer("回家");
        System.out.println(q);
        while (!q.isEmpty()) {
            Thread.sleep(2000);
            String work = q.poll();
            System.out.printf("我正在做 %s, 還剩下 %s\n", work, q);
        }
        System.out.println("工作完成");
        System.out.println(q);
    }
}
