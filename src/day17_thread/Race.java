package day17_thread;

public class Race {
    public static void main(String[] args) {
        String who = Thread.currentThread().getName();
        System.out.printf("%s 找了 2 個幫手\n", who);
        Walk w1 = new Walk(); // User 執行緒
        Walk w2 = new Walk(); // User 執行緒
        Walk w3 = new Walk(); // 背景執行緒
        w1.setName("烏龜");
        w2.setName("兔子");
        w3.setName("背景狗");
        w1.setPriority(Thread.MAX_PRIORITY); // 10
        w2.setPriority(3);
        w3.setPriority(1);
        w3.setDaemon(true); // 我是背景
        w1.start();
        w2.start();
        w3.start();
        System.out.printf("總共有 %d 條執行緒\n", Thread.activeCount());
        System.out.printf("%s 沒事做了在看戲~\n", who);
    }
}
