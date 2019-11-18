package day08_poly;

import java.util.Random;

public class Zoo3 {
    public static void main(String[] args) {
        // 抽動物
        System.out.println(new Zoo3().getAnimal().getName());
        
    }
    public Animal getAnimal() {
        int n = new Random().nextInt(4);
        switch(n) {
            case 0:
                return new Lion(4, "獅子");
            case 1:
                return new Bird(2, "鳥");
            case 2:
                return new Ostrich("鴕鳥");
            default:
                return new Animal(0, "沒有");
        }
    }
    
    
}
