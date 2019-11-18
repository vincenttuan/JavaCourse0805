package day19_sync2;

public class Cookies {
    private static boolean empty = true;
    
    public synchronized void eat(int num) {
        while(empty) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("小白狗吃了第 " + num + " 片餅乾");
        empty = true;
        notify();
    }
    
    
    public synchronized void put(int num) {
        while(!empty) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("主人放了第 " + num + " 片餅乾");
        empty = false;
        notify();
    }
    
    
    
}
