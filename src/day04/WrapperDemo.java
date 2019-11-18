package day04;

import java.math.BigDecimal;

public class WrapperDemo {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        
        String ch = "100";
        String math = "90";
        int int_ch = Integer.parseInt(ch);
        int int_math = Integer.parseInt(math);
        System.out.println(int_ch + int_math);
        
        boolean b = Boolean.parseBoolean("TruE");
        System.out.println(b);
        
        System.out.println(0.1 + 0.1 == 0.2);
        System.out.println(0.1 + 0.1 + 0.1 == 0.3);
        System.out.println(0.1 + 0.1 + 0.1);
        
        BigDecimal a1 = new BigDecimal("0.1");
        BigDecimal a2 = new BigDecimal("0.1");
        BigDecimal a3 = new BigDecimal("0.1");
        double a4 = a1.add(a2).add(a3).doubleValue();
        System.out.println(a4);
        System.out.println(a4 == 0.3);
        
    }
}
