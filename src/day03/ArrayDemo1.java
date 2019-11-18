package day03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] x = new int[3];
        x[0] = 100;
        x[1] = 90;
        x[2] = 80;
        System.out.println(x[0]);
        
        int[] y = {100, 90, 80};
        System.out.println(y[1]);
        y[1] = 70;
        System.out.println(y[1]);
        
    }
}
