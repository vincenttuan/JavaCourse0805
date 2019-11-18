package day08_singleton;

public class CalcMachine {
    public static void main(String[] args) {
        Calc calc = Calc.getInstance();
        System.out.println(calc.add(10, 20));
        
        Calc calc2 = Calc.getInstance();
        System.out.println(calc2.sub(10, 20));
        
    }
}
