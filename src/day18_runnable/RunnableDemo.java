package day18_runnable;

public class RunnableDemo {
    public static void main(String[] args) {
        
        Runnable r1 = () -> System.out.println("吃飯");
        Runnable r2 = () -> System.out.println("看書");
        
        Thread t = new Thread(r2);
        t.start();
        
        Thread t2 = new Thread(() -> System.out.println("TV"));
        t2.start();
        
        play(() -> System.out.println("喝果汁"));
        play(() -> System.out.println("喝咖啡"));
        
    }
    
    public static void play(Runnable r) {
        new Thread(r).start();
    }
}
