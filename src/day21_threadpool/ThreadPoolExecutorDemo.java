package day21_threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor exec = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        exec.submit(new Lotto());
        exec.submit(new Lotto());
        exec.submit(new Lotto());
        exec.submit(new Lotto());
        exec.submit(new Lotto());
        System.out.println("子執行緒有: " + (Thread.activeCount() - 1) + " 條");
        exec.shutdown();
        
        
    }
}
