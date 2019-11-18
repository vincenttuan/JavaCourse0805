package day05;

public class Algorithm2 {
    public static void main(String[] args) {
        loop:
        for(int i=2;i<=100;i++) {
            for(int j=2;j<i;j++) {
                if( i % j == 0) {
                    continue loop;
                }
            }
            System.out.println(i);
        }
        
    }
}

