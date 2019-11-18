package day22_parallel;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelDemo2 {
    public static void main(String[] args) {
        // Parallel + Sequential
        Stream.of(3, 1, 4, 2, 6, 5)
                .parallel()
                .map(n -> n * 2)
                .peek(n -> System.out.println("log: "+ n))
                .collect(Collectors.toList())
                .stream()
                .sequential()
                .sorted()
                .forEach(System.out::println);
    }
}
