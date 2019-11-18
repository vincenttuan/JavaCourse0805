package day19_sync2;

public class Dog extends Thread {
    private Cookies cookies;

    public Dog(Cookies cookies) {
        this.cookies = cookies;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            cookies.eat(i);
        }
    }
    
}
