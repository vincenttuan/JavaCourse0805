package day14_collectors_lab2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;

public class PersonMain {
    
    public static void main(String[] args) {
        List<Person> javaProgrammers = PersonUtil.getJavaProgrammers();
        List<Person> phpProgrammers = PersonUtil.getPHPProgrammers();
        
        System.out.println("1.所有程序員的姓名:");
        javaProgrammers.forEach(p -> System.out.print(p.getFirstName() + p.getLastName() + ", "));
        System.out.println();
        phpProgrammers.forEach(p -> System.out.print(p.getFirstName() + p.getLastName() + ", "));
        System.out.println();
        
        System.out.println("\n2.給程序員加薪 5% :");
        Consumer<Person> raiseSalary = p -> p.setSalary((int)(p.getSalary() * 1.05));
        javaProgrammers.forEach(raiseSalary);
        phpProgrammers.forEach(raiseSalary);
        javaProgrammers.forEach(p -> System.out.printf("%s $%d, ", p.getFirstName(), p.getSalary()));
        System.out.println();
        phpProgrammers.forEach(p -> System.out.printf("%s $%d, ", p.getFirstName(), p.getSalary()));
        System.out.println();
        
        System.out.println("\n3.下面是月薪超過 $1,400 的PHP程序員:");
        phpProgrammers.stream()
                .filter(p -> p.getSalary() > 1400)
                .forEach(p -> System.out.printf("%s %d $%d, ", p.getFirstName(), p.getAge(), p.getSalary()));
        System.out.println();
        
        System.out.println("\n4.下面是年齡大於 35歲且月薪在 $1,400以上的女PHP程序員:");
        phpProgrammers.stream()
                .filter(p -> p.getAge() > 35)
                .filter(p -> p.getSalary() > 1400)
                .filter(p -> p.getGender().equals("female"))
                .forEach(p -> System.out.printf("%s %s %d $%d, ", p.getFirstName(), p.getGender(), p.getAge(), p.getSalary()));
        System.out.println();
        
        System.out.println("\n5.年齡大於 24歲的女性 Java programmers:");
        javaProgrammers.stream()
                .filter(p -> p.getAge() > 24)
                .filter(p -> p.getGender().equals("female"))
                .forEach(p -> System.out.printf("%s %s %d $%d, ", p.getFirstName(), p.getGender(), p.getAge(), p.getSalary()));
        System.out.println();
        
        System.out.println("\n6.最前面的3个 Java programmers:");
        javaProgrammers.stream()
                .limit(3)
                .forEach(p -> System.out.printf("%s %s %d $%d, ", p.getFirstName(), p.getGender(), p.getAge(), p.getSalary()));
        System.out.println();
        
        System.out.println("\n7.最前面的3个女性 Java programmers:");
        javaProgrammers.stream()
                .filter(p -> p.getGender().equals("female"))
                .limit(3)
                .forEach(p -> System.out.printf("%s %s %d $%d, ", p.getFirstName(), p.getGender(), p.getAge(), p.getSalary()));
        System.out.println();
        
        System.out.println("\n8.根據 age 排序,並顯示前 5 个 Java programmers:");
        javaProgrammers.stream()
                .sorted((p1, p2) -> p1.getAge() - p2.getAge())
                .limit(5)
                .forEach(p -> System.out.printf("%s %s %d $%d, ", p.getFirstName(), p.getGender(), p.getAge(), p.getSalary()));
        System.out.println();
        
        System.out.println("\n9.根據 salary 排序 Java programmers:");
        javaProgrammers.stream()
                .sorted((p1, p2) -> p1.getSalary()- p2.getSalary())
                .forEach(p -> System.out.printf("%s %s %d $%d, ", p.getFirstName(), p.getGender(), p.getAge(), p.getSalary()));
        System.out.println();
        
        System.out.println("\n10.工資最低的 Java programmer:");
        Person javap_min = javaProgrammers.stream()
                .min((p1, p2) -> p1.getSalary()- p2.getSalary())
                .get();
        System.out.println(javap_min);
        
        System.out.println("\n11.工資最高的 Java programmer:");
        Person javap_max = javaProgrammers.stream()
                .max((p1, p2) -> p1.getSalary()- p2.getSalary())
                .get();
        System.out.println(javap_max);
        
        System.out.println("\n12.計算給付 Java and php programmers 的所有 money: ");
        int java_sum = javaProgrammers.stream()
                .mapToInt(p -> p.getSalary())
                .sum();
        System.out.println("All Java's salary $" + java_sum);
        int php_sum = phpProgrammers.stream()
                .mapToInt(p -> p.getSalary())
                .sum();
        System.out.println("All PHP's salary $" + php_sum);
        
        // 13.統計 summaryStatistics方法
        System.out.println("\n13.統計 summaryStatistics 方法 (以 salary 為例) ");
        
        IntSummaryStatistics stats = javaProgrammers.stream()
                .mapToInt(e -> e.getSalary())
                .summaryStatistics();
        System.out.println("Java程序員員工數量 : " + stats.getCount());
        System.out.println("Java程序員薪資最高 : $" + stats.getMax());
        System.out.println("Java程序員薪資最低 : $" + stats.getMin());
        System.out.println("Java程序員薪資總和 : $" + stats.getSum());
        System.out.println("Java程序員平均薪資 : $" + stats.getAverage());
        
    }   
}
