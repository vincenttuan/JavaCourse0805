package day20_executor;

public class Main {
    public static void main(String[] args) {
        TimeExecutor executor = new TimeExecutor();
        executor.execute(new GetTime());
        executor.execute(new GetTime());
        executor.execute(new GetTime());
        
    }
}
