package day19_sync2;

public class Play {
    public static void main(String[] args) {
        Cookies cookies = new Cookies();
        Master master = new Master(cookies);
        Dog dog = new Dog(cookies);
        dog.start();
        master.start();
    }
}
