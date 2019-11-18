package day16_gc;


class Ball {
    long id;

    public Ball(long id) {
        System.out.println(Thread.currentThread().getName() + " 執行 Ball 建構子");
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(Thread.currentThread().getName() + " 執行 Ball finalize()");
    }
    
    
}
public class GCTest {
    public static void main(String[] args) {
        Ball b1 = new Ball(999999999999999999L);
        b1 = null;
        System.gc();
        
        // 繼續 run 其他...
        for(int i = 1;i<100000000;i++);
    }
}
