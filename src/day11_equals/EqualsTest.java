package day11_equals;

public class EqualsTest {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        String s1 = new String("Red");
        String s2 = new String("Red");
        System.out.println(a == b);
        System.out.println(s1.equals(s2));
        
        Pen p1 = new Pen("Red", 100);
        Pen p2 = new Pen("Red", 100);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}
