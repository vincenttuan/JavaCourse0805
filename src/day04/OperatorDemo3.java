package day04;

public class OperatorDemo3 {
    public static void main(String[] args) {
        int[] x = {100, 80};
        System.out.println(x[0]);
        update(x);
        System.out.println(x[0]);
        
        String s1 = "100";
        update(s1);
        System.out.println(s1);
    }
    public static void update(int[] y) {
        y[0] = 40;
    }
    
    public static void update(String s2) {
        s2 = "40";
    }
    
}
