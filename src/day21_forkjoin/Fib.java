package day21_forkjoin;

import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class Fib {
    public static void main(String[] args) {
        // 單緒
        Stream.iterate(new long[]{0, 1}, s -> new long[]{s[1], s[0] + s[1]})
                .sequential()
                .limit(35)
                .map(n -> n[0])
                .forEach(n -> System.out.print(n + ", "));
        
        System.out.println();
        
        // 並行 fork-join
        Stream.iterate(new long[]{0, 1}, s -> new long[]{s[1], s[0] + s[1]})
                .parallel()
                .limit(35)
                .map(n -> n[0])
                .forEach(n -> System.out.print(n + ", "));
    }
}
