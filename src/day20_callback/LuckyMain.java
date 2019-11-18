package day20_callback;

import java.util.Date;


public class LuckyMain {
    public static void main(String[] args) throws Exception {
        
        Callback cb = (value) -> System.out.println("value = " + value);
        Callback cb2 = (value) -> System.out.println("value2 = " + value);
        
        LuckyNumber luckyNumber = new LuckyNumber(cb);
        LuckyNumber luckyNumber2 = new LuckyNumber(cb2);
        new Thread(luckyNumber).start();
        new Thread(luckyNumber2).start();
        
    }
}
