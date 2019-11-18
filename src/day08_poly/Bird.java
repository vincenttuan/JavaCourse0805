package day08_poly;

public class Bird extends Animal {

    public Bird(int feet, String name) {
        super(feet, name);
    }

    @Override
    public void move() {
        System.out.println("會飛");
    }
    
    public void eat() {
        System.out.println("小麥");
    }
    
}
