package day16_assert;

public class Test {
    public static void main(String[] args) {
        MyCalc calc = new MyCalc();
        calc.add(5, 5);
        assertFalse(10, calc);
    }
    public static void assertFalse(int x, MyCalc calc) {
        if(x == calc.getSum()) {
            assert(false): "x 不可= sum";
        } else {
            System.out.println("pass");
        }
    }
}
