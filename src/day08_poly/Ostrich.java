package day08_poly;

public class Ostrich extends Bird {

    public Ostrich(String name) {
        super(2, name);
    }

    @Override
    public void move() {
        System.out.println("不會飛");
    }
    
    public void spirit() {
        System.out.println("鴕鳥心態");
    }
    
    
}
