package day14_collectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        IntStream.rangeClosed(1, 10).forEach(i -> {
            int scoure = new Random().nextInt(11);
            scores.add(scoure);
        });
        
        System.out.println(scores);
        Collections.sort(scores);
        System.out.println(scores);
        
        // Java 7
        Collections.sort(scores, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(scores);
        // Java 8 Lambda
        Collections.sort(scores, (o1, o2) -> o2 - o1);
        System.out.println(scores);
        
        // Max
        System.out.println(Collections.max(scores));
        
        // Min
        System.out.println(Collections.min(scores));
    }
}
