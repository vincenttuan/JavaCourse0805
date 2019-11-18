package day21_threadpool;

import java.util.Random;

public class Lotto implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (Exception e) {
        }
        String tName = Thread.currentThread().getName();
        int num = new Random().nextInt(100);
        System.out.println(tName + ":" + num);
    }
    
}
