package day03;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //System.out.println(new Random().nextInt(10));
        int[] x = {8, 1, 2, 5, 4, 9};
        print(x);
        Arrays.sort(x);
        print(x);
        shuffle(x);
        print(x);
        shuffle_random(x, 100);
        print(x);
        System.out.println("max=" + max(x));
        System.out.println("min=" + min(x));
    }
    
    public static void print(int [] x) {
        for(int i=0;i<x.length;i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    
    public static void shuffle(int [] x) {
        int a = x[0];
        int b = x[2];
        x[0] = b;
        x[2] = a;
    }
    
    public static void shuffle_random(int [] x) {
        int idx_a = new Random().nextInt(x.length);
        int idx_b = new Random().nextInt(x.length);
        int a = x[idx_a];
        int b = x[idx_b];
        x[idx_a] = b;
        x[idx_b] = a;
    }
    
    public static void shuffle_random(int [] x, int count) {
        for(int i=1;i<=count;i++) {
            shuffle_random(x);
        }
    }
    
    public static int max(int [] x) {
        // 2 1 9 8 5 4 
        int max = Integer.MIN_VALUE;
        for(int i=0, lens=x.length;i<lens;i++) {
            if(x[i] > max) {
                max = x[i];
            }
            //max = (x[i] > max)?x[i]:max;
        }
        return max;
    }
    
    public static int min(int [] x) {
        int min = Integer.MAX_VALUE;
        for(int i=0, lens=x.length;i<lens;i++) {
            min = (x[i] < min)?x[i]:min;
        }
        return min;
    }
}
