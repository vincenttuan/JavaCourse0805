package day10_lambda_2;

public class Test {
    public static void main(String[] args) {
        Salary salary = (y) -> y*1;
        System.out.println(salary.get(30000));
        
        Plus plus = (x) -> (y) -> y+x;
        System.out.println(plus.get(50000).get(30000));
    }
}
