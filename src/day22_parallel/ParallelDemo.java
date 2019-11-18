package day22_parallel;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelDemo {
    public static void main(String[] args) {
        // Sequential
        System.out.println(Stream.of(3, 1, 4, 1, 5, 9).isParallel());
        System.out.println(Stream.iterate(1, n -> n + 1).isParallel());
        System.out.println(Stream.generate(Math::random).isParallel());
        System.out.println(Arrays.asList(3, 1, 4, 1, 5, 9).stream().isParallel());
        // Parallel
        System.out.println(Stream.of(3, 1, 4, 1, 5, 9).parallel().isParallel());
        System.out.println(Arrays.asList(3, 1, 4, 1, 5, 9).parallelStream().isParallel());
        
    }
}
