package day15_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        play();
    }
    
    public static void play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數字");
        try {
            int x = sc.nextInt();
            System.out.println("您輸入的是: " + x);
        } catch (InputMismatchException e) {
            System.out.println("您輸入的不正確, 請重新輸入!");
            play();
            // log ...
        }
    }
    
}
