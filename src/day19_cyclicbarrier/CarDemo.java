package day19_cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CarDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
        new Car(cyclicBarrier).start();
        new Car(cyclicBarrier).start();
        new Car(cyclicBarrier).start();
        new Car(cyclicBarrier).start();
        
    }
}
