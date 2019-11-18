package day21_threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo4 {
    public static void main(String[] args) throws Exception {
        ThreadPoolExecutor pool = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
        pool.submit(new LongJob("A"));
        pool.submit(new ShortJob("B"));
        pool.submit(new LongJob("C"));
        pool.submit(new ShortJob("D"));
        pool.submit(new ShortJob("E"));
        System.out.println("子執行緒有: " + (Thread.activeCount() - 1) + " 條");
        
        // 關閉 pool
        pool.shutdown();
        
        // 監聽 pool
        while(!pool.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("pool 還沒關閉");
        }
    }
}
