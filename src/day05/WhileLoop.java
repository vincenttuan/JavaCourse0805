package day05;

import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {
        
        while (true) {            
            int score = new Random().nextInt(101);
            if(score >= 60)
                System.out.println(score);
            else
                break;
        }
        
    }
}
