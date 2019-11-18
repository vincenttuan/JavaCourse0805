package day20_callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class LuckyNumber implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("call() 執行者:" + Thread.currentThread().getName());
        Thread.sleep(5000);
        int number = new Random().nextInt(100);
        return number;
    }
    
}
