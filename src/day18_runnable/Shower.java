package day18_runnable;

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("瓦斯工人開始送瓦斯");
        for(int i=1;i<=3;i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("發生意外");
                return;
            }
            System.out.print(i + "秒\t");
        }
        System.out.println("\n瓦斯工人送到了");
    }
    
}

class Father implements Runnable {

    @Override
    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒瓦斯了");
        System.out.println("爸爸打電話請瓦斯工人送瓦斯");
        
        Thread worker = new Thread(new Worker());
        worker.start();
        
        try {
            worker.join(6000);
        } catch (Exception e) {
        }
        
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸澡洗完了");
    }
    
}

public class Shower {
    
    public static void main(String[] args) {
        Thread father = new Thread(new Father());
        father.start();
    }
    
}

