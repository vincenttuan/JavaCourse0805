package day22_invoke;

import java.util.Random;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        int n = new Random().nextInt(100);
        return n;
    }
    
}
