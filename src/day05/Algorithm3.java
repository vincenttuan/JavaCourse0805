package day05;

public class Algorithm3 {
    public static void main(String[] args) {
        int[] id = {1,0,1,2,3,4,5,6,7,8,9};
        int[] dx = {1,9,8,7,6,5,4,3,2,1,1};
        int sum = 0;
        for(int i=0;i<id.length;i++) {
            sum += id[i] * dx[i];
        }
        System.out.println(sum % 10);
    }
}

