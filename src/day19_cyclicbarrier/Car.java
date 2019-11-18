package day19_cyclicbarrier;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car extends Thread {
    private CyclicBarrier cyclicBarrier;

    public Car(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        String user = Thread.currentThread().getName();
        try {
            System.out.println(user + " 出發了...");
            Thread.sleep(new Random().nextInt(6000));
            System.out.println(user + " 到台中了.等待其他人...");
            cyclicBarrier.await();
        } catch (Exception e) {
        }
        System.out.println(user + " 繼續往高雄出發...");
    }
    
}
