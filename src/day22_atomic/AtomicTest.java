package day22_atomic;

import com.google.gson.internal.Streams;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Add implements Runnable {
    static AtomicInteger count = new AtomicInteger(0);
    public void run() {
        int x = count.incrementAndGet();
        System.out.print(x + " ");
    }
}

public class AtomicTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Add());
        Thread t2 = new Thread(new Add());
        Thread t3 = new Thread(new Add());
        Stream.of(t1, t2, t3).forEach(t -> t.start());
        
    }
}
