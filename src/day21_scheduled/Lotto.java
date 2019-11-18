package day21_scheduled;

import java.util.Date;
import java.util.Random;

public class Lotto implements Runnable {

    @Override
    public void run() {
        System.out.println("Lotto 開始工作時間: " + new Date());
        String tName = Thread.currentThread().getName();
        int num = new Random().nextInt(100);
        System.out.println(tName + ":" + num);
    }
    
}
