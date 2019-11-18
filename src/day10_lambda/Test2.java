package day10_lambda;

public class Test2 {
    public static void main(String[] args) {
        ICalc add   = (x, y) -> x + y;
        ICalc sub   = (x, y) -> x - y;
        ICalc multi = (x, y) -> x * y;
        ICalc div   = (x, y) -> x / y;
        
        System.out.println(add.calc(10, 20));
    }
}
