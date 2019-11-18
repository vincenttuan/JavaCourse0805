package day20_observer;

public class UserObserver implements Observer {
    private String name;

    public UserObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String data) {
        System.out.printf("%s 收到了 %s\n", name, data);
    }
    
}
