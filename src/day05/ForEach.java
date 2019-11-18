package day05;

public class ForEach {
    public static void main(String[] args) {
        int[] x = {100, 90, 80};
        
        for(int i=0;i<x.length;i++) {
            System.out.println(x[i]);
        }
        
        for(int i : x) {
            System.out.println(i);
        }
        
    }
}
