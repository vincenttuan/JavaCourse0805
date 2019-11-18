package day02.bar;

import day02.foo.Coco;

public class Baby extends Coco{
    public void play() {
        System.out.println("奶嘴");
        super.play();
    }
    
    public static void main(String[] args) {
        Baby baby = new Baby();
        baby.play();
    }
}
