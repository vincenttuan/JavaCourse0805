package day21_scheduled;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SingleThreadScheduleFixedDelay {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        System.out.println("Main 開始排定工作時間: " + new Date());
        service.scheduleWithFixedDelay(new GetPrice(), 1, 2, TimeUnit.SECONDS);
        
    }
}
