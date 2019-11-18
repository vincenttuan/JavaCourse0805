package day06;

import java.util.Arrays;
import java.util.List;

public class Exam {
    public static void main(String[] args) {
        Score s1 = new Score("John", 100, 90, 80);
        Score s2 = new Score("Mary", 80, 100, 70);
        Score s3 = new Score("Joe", 50, 100, 100);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        List<Score> list = Arrays.asList(s1, s2, s3);
        System.out.println(list);
        
        // Java 7
        for(Score s : list) {
            if(s.getChinese() >= 60) {
                System.out.println(s.getName());
            }
        }
        
        // Java 8
        list.forEach((Score s) -> {
            if(s.getChinese() >= 60) {
                System.out.println(s.getName());
            }
        });
        
        // Java 8 Stream
        list.stream()
                .filter(s -> s.getChinese() >= 60)  // 過濾 if
                .map(s -> s.getName())  // 轉換 Score 物件轉換成 String
                .forEach(System.out::println); //.forEach(s -> System.out.println(s));
        
    }
}
