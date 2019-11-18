package day15_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo5 {

    public static void main(String[] args) {
        try {
            play();
        } catch (ArithmeticException e) {
            System.out.println("數學錯誤, " + e);
        } catch (InputMismatchException e) {
            System.out.println("不是數字");
        }
    }

    public static void play() throws ArithmeticException, InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("分子固定 10, 請輸入分母");
        int x = sc.nextInt();
        int result = 10 / x;
        System.out.printf("您輸入的是: %d, 10/%d=%d\n", x, x, result);
    }

}
