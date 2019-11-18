package day20_callable;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class LuckyMain {
    public static void main(String[] args) throws Exception {
        LuckyNumber luckyNumber = new LuckyNumber();
        FutureTask<Integer> task = new FutureTask<>(luckyNumber);
        System.out.println("啟動執行緒");
        new Thread(task).start();
        int number = task.get();
        System.out.println("得到:" + number);
        System.out.println("結束");  
        
    }
}
