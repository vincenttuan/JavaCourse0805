package day21_forkjoin;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prime {
    public static void main(String[] args) {

        long count = Stream.iterate(0, n -> n + 1)
                .limit(20_0000)
                .parallel()
                .filter(Prime::isPrime)
                .count();

        System.out.println("Total: " + count);

    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
}
