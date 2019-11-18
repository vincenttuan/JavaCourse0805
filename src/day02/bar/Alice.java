package day02.bar;

import day02.foo.Coco;

public class Alice {
    public void play() {
        System.out.println("夢遊");
        Coco coco = new Coco();
        //coco.play();
    }
    
    public static void main(String[] args) {
        Alice alice = new Alice();
        alice.play();
    }
}
