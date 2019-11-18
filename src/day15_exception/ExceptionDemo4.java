package day15_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo4 {

    public static void main(String[] args) {
        play();
    }

    public static void play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("分子固定 10, 請輸入分母");
        try {
            int x = sc.nextInt();
            int result = 10 / x;
            System.out.printf("您輸入的是: %d, 10/%d=%d\n", x, x, result);
        } catch (Exception e) {
            System.out.println("您輸入的數字不合法...");
            play();
        }

    }

}
