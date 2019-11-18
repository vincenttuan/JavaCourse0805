package day21_threadpool;

public class ShortJob implements Runnable {
    private String name;

    public ShortJob(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + "短任務");
    }
    
}
