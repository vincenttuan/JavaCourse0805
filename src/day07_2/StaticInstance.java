package day07_2;

public class StaticInstance {
    public static void main(String[] args) {
        a();
        StaticInstance x = new StaticInstance();
        x.b();
        x.c();
    }
    
    public static void a() {
        System.out.println("a");
    }
    
    public void b() {
        System.out.println("b");
        c();
    }
    public void c() {
        System.out.println("c");
    }
}
