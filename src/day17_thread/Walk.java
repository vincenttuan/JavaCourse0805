package day17_thread;

public class Walk extends Thread {

    @Override
    public void run() {
        move();
    }
    
    public void move() {
        String who = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 走了 %d 步\n", who, i);
        }
    }
    
}
