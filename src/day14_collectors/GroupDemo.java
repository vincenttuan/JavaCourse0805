package day14_collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;

public class GroupDemo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("this", "is", "a", "long", "list", "of", 
                "strings", "to", "use", "as", "a", "demo");
        System.out.println(strings);
        
        // Group 群組
        Map map = strings.stream().collect(groupingBy(x -> x.length()));
        System.out.println(map);
        
        Map map2 = strings.stream().collect(groupingBy(String::length));
        System.out.println(map2);
        
        Map map3 = strings.stream().collect(groupingBy(String::length, Collectors.counting()));
        System.out.println(map3);
        
    }
}
