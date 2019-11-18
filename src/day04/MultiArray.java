package day04;

public class MultiArray {
    public static void main(String[] args) {
        
        int[][] scores = {
            {100, 90, 80}, 
            {70, 60, 50}
        };
        
        //System.out.println(scores);
        //System.out.println(scores[0]);
        
        for(int i=0;i<scores.length;i++) {
            for(int j=0;j<scores[i].length;j++) {
                System.out.println(scores[i][j]);
            }
        }
    }
}
