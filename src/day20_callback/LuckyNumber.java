package day20_callback;

import java.util.Random;

public class LuckyNumber implements Runnable {
    private Callback cb;

    public LuckyNumber(Callback cb) {
        this.cb = cb;
    }
    
    @Override
    public void run(){
        try {
            System.out.println("call() 執行者:" + Thread.currentThread().getName());
            Thread.sleep(5000);
            int number = new Random().nextInt(100);
            cb.setValue(number);
        } catch (Exception e) {
        }
        
    }
    
}
