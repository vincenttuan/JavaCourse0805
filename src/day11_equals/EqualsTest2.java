package day11_equals;

public class EqualsTest2 {
    public static void main(String[] args) {
        String s1 = new String("Red");
        String s2 = new String("Red");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        
        Pen p1 = new Pen("Red", 200);
        Pen p2 = new Pen("Red2", 200);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
