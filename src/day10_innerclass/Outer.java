package day10_innerclass;

public class Outer {
    int x = 100;
    static int y = 200;
    
    // 一般內部類別
    class Inner {
        int z = 20;
        void print() {
            System.out.println(Outer.this.x);
            System.out.println(Outer.y);
            System.out.println(this.z);
            System.out.println(SInner.z);
        }
    }
    
    // static內部類別
    static class SInner {
        static int z = 10;
        //int z2 = 30;
        static void print() {
            System.out.println(Outer.y);
            System.out.println(SInner.z);
            //System.out.println(this.z2);
        }
    }
    
    public static void main(String[] args) {
        Outer.SInner sInner = new Outer.SInner();
        sInner.print();
    }
}
