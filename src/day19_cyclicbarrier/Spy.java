package day19_cyclicbarrier;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Spy extends Thread {
    private CyclicBarrier cyclicBarrier;

    public Spy(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }
    @Override
    public void run() {
        String user = Thread.currentThread().getName();
        try {
            System.out.println(user + " 出發探聽考試成績了...");
            Thread.sleep(new Random().nextInt(6000));
            int score = new Random().nextInt(101);
            System.out.println(user + " 探聽到了." + score);
            Exam.scores.add(score);
            cyclicBarrier.await();
        } catch (Exception e) {
        }
        
    }
}
