package day20_executor;

import java.util.concurrent.Executor;

public class TimeExecutor implements Executor {

    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
    
}
