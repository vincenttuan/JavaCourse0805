package day09;

public class EDog extends Animal implements Electricity{

    @Override
    public void play() {
        System.out.println("打發時間");
    }

    @Override
    public void eat() {
        System.out.println("電");
    }

    @Override
    public int volt() {
        return 5;
    }
    
}
