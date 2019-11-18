package day21_threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo2 {
    public static void main(String[] args) throws Exception {
        ThreadPoolExecutor pool = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
        pool.submit(new Lotto());
        pool.submit(new Lotto());
        pool.submit(new Lotto());
        pool.submit(new Lotto());
        pool.submit(new Lotto());
        System.out.println("子執行緒有: " + (Thread.activeCount() - 1) + " 條");
        pool.shutdown();
        
        
    }
}
