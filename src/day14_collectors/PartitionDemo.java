package day14_collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class PartitionDemo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("this", "is", "a", "long", "list", "of", 
                "strings", "to", "use", "as", "a", "demo");
        System.out.println(strings);
        
        // Partition 分二組
        Map map = strings.stream().collect(Collectors.partitioningBy(s -> s.length() % 2 == 0));
        System.out.println(map);
        
        Map map2 = strings.stream()
                .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0, Collectors.counting()));
        System.out.println(map2);
        
    }
}
