package day20_executor;

import java.util.Date;

public class GetTime implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println(new Date());
        } catch (Exception e) {
        }
    }
    
}
