package day14_collectors_lab;

import java.util.Arrays;
import static java.util.Comparator.comparingInt;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentGroupDemo {
    public static void main(String[] args) {
        List<Student> stds = Arrays.asList(
                new Student("Jessy", "Java ME", "Chicage", 18),
                new Student("Helen", "Java EE", "Houston", 20),
                new Student("John",  "Java EE", "Houston", 22),
                new Student("Mark",  "Java ME", "Chicage", 19),
                new Student("Tom",   "Java EE", "Taipei", 25));
        
        System.out.println(stds);
        
        //stds.stream().collect(Collectors.groupingBy(s -> s.getCourse()));
        Map map = stds.stream().collect(Collectors.groupingBy(Student::getCourse));
        System.out.println(map);
        map.forEach((k, v) -> System.out.println(k));
        
        Map map2 = stds.stream().collect(Collectors.groupingBy(Student::getCourse, 
                Collectors.maxBy(comparingInt(Student::getAge))));
        System.out.println(map2);
    }
}
