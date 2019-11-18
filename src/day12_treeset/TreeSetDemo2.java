package day12_treeset;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 42000);
        Employee e2 = new Employee("Mary", 85000);
        Employee e3 = new Employee("Jean", 60000);
        
        HashSet<Employee> hs = new HashSet<>();
        hs.add(e1);hs.add(e2);hs.add(e3);
        System.out.println(hs);
        
        TreeSet<Employee> ts = new TreeSet<>();
        Employee.sort = 1; // 1, -1
        ts.add(e1);ts.add(e2);ts.add(e3);
        System.out.println(ts);
    }
}
