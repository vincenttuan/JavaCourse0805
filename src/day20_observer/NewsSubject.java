package day20_observer;

import java.util.ArrayList;
import java.util.List;

public class NewsSubject implements Subject {
    private List<Observer> list = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyData(String data) {
        list.forEach(ob -> ob.update(data));
    }
    
}
