package day15_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo_finally {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入數字");
            int x = sc.nextInt();
            System.out.println("您輸入的是: " + x);
            return;
            //System.exit(1);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("一定要執行!");
        }
    }

    

}
