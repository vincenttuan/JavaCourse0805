package day21_forkjoin;

import java.util.stream.IntStream;

public class RangeTest {
    public static void main(String[] args) {
        
        
        IntStream.rangeClosed(1, 10)
                .parallel()
                .forEach(e -> System.out.println(Thread.currentThread().getName() + ":" + e));
        
        System.out.println(Thread.activeCount());
    }
}
