package day05;

import java.util.Random;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int ans = new Random().nextInt(99) + 1;
        int min = 0;
        int max = 100;
        do {            
            Scanner sc = new Scanner(System.in);
            System.out.printf("%d ~ %d 之間猜一數字 : \n", min, max);
            int guess = sc.nextInt();
            if(guess == ans) {
                System.out.println("bingo");
                break;
            } else if(guess < ans) {
                min = guess;
            } else {
                max = guess;
            }
            
        } while (true);
        
    }
}
