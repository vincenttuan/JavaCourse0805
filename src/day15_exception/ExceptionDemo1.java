package day15_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
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
            System.out.println("錯誤發生~");
            System.out.println("錯誤原因: " + e.getMessage());
            System.out.println("錯誤類型: " + e.getClass());
            System.out.println(e);
            System.out.println("詳細錯誤:");
            e.printStackTrace(System.out);
        }
        
        
    }
    
}
