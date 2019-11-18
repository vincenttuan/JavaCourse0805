package day19_cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class SpyAction {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, ()->{
            System.out.println(Thread.currentThread().getName() + " 回報:");
            System.out.println(Exam.scores);
            System.out.println(Exam.scores.stream().mapToInt(e -> e).sum());
            System.out.println(Exam.scores.stream().mapToInt(e -> e).average().getAsDouble());
        });
        
        new Spy(cyclicBarrier).start();
        new Spy(cyclicBarrier).start();
        new Spy(cyclicBarrier).start();
        new Spy(cyclicBarrier).start();
    }
}
