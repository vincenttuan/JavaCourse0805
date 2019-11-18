package algorithms;

public class ThreeNums {
    
    public static void main(String[] args) {
        // 有1、2、3、4個數字，能組成多少個互不相同且無重複數字的三位數？
        int sum = 0;
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=4;j++) {
                for(int k=1;k<=4;k++) {
                    if(i != j && j != k && i != k) {
                        ++sum;
                        System.out.printf("%d%d%d\n", i, j, k);
                    }
                }
            }
        }
        System.out.println("sum=" + sum);
    }
    
}
