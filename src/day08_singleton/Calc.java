package day08_singleton;

public class Calc {
    private static Calc _instance;
    static { // static init
        _instance = new Calc();
    }
    
    private Calc() {
        
    }
    
    { // instance init
        System.out.println("Calc 建構子");
    }
    
    
    public static Calc getInstance() {
        return _instance;
    }
    
    public int add(int x, int y) {
        return x + y;
    }
    
    public int sub(int x, int y) {
        return x - y;
    }
}
