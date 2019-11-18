package day08_poly;

public class Lion extends Animal {

    public Lion(int feet, String name) {
        super(feet, name);
    }

    @Override
    public void move() {
        System.out.println("會跑");
    }
    
    public void eat() {
        System.out.println("肉");
    }
    
}
