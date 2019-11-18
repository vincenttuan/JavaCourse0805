package day21_threadpool;

public class LongJob implements Runnable {
    private String name;

    public LongJob(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println(name + "長任務開始");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        System.out.println(name + "長任務結束");
    }
    
}
