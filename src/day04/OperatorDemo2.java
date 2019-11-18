package day04;

public class OperatorDemo2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        
        if(a > 0 & ++b > 0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println(b);
        
    }
}
