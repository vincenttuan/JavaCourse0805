package day06_3;

public class MyClass {
    int i = 100;
    public MyClass() {
        this(10);
    }
    public MyClass(int x) {
        this(10, 10);
        i += x;
    }
    public MyClass(int x, int y) {
        i += (x+y);
    }
}
