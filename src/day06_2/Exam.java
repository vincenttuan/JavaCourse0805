package day06_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam {
    public static void main(String[] args) {
        Student stud1 = new Student("John", '男', 18);
        Student stud2 = new Student("Mary", '女', 17);
        Student stud3 = new Student("Joe", '女', 23);
        
        Score score1 = new Score(stud1, 100, 90, 100);
        Score score2 = new Score(stud2, 80, 100, 70);
        Score score3 = new Score(stud3, 50, 100, 100);
        
        // 印出英文考100的學生名字
        List<Score> scores = Arrays.asList(score1, score2, score3);
        List<String> names = new ArrayList<>();
        int count = 0;
        for(Score score : scores) {
            if(score.getEnglish() == 100) {
                System.out.println(score.getStud().getName());
                names.add(score.getStud().getName());
                ++count;
            }
        }
        System.out.println(count);
        System.out.println(names);
        
        //-----------------------------------------------------------------
        scores.stream()
                .filter(score -> score.getEnglish() == 100)
                .map(score -> score.getStud().getName())
                .forEach(System.out::println);
        
        long count2 = scores.stream()
                .filter(score -> score.getEnglish() == 100)
                .map(score -> score.getStud().getName())
                .count();
        System.out.println(count2);
        
        List<String> names2 = scores.stream()
                .filter(score -> score.getEnglish() == 100)
                .map(score -> score.getStud().getName())
                .collect(Collectors.toList());
        System.out.println(names2);
    }
}
