package day13_list;

import java.util.stream.Stream;

public class Stream_Iterator {
    public static void main(String[] args) {
        // 無限流
//        Stream.iterate(0, n -> n + 1)
//                .limit(10)
//                .forEach(System.out::println);

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0]+n[1]})
               .limit(10)
               .forEach(n -> System.out.println(n[0]));

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0]+n[1]})
               .limit(10)
               .map(n -> n[0])
               .forEach(System.out::println);
    }
}
