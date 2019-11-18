package day22_invoke;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();
        Collection<Lotto> list = new ArrayList<>();
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        List<Future<Integer>> results = service.invokeAll(list);
        for(Future f : results) {
            System.out.println(f.get());
        }
        System.out.println("------");
        int num = service.invokeAny(list);
        System.out.println(num);
        service.shutdown();
    }
}
