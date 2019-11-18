package day21_scheduled;

import java.util.Date;
import java.util.Random;

public class GetPrice implements Runnable {

    @Override
    public void run() {
        // 模擬執行時間
        System.out.println("報價開始時間: " + new Date());
        try {
            Thread.sleep(new Random().nextInt(3000));
        } catch (Exception e) {
        }
        System.out.println("台積電報價:" + (300 + new Random().nextInt(30)));
        System.out.println("報價結束時間: " + new Date());
    }
    
}
