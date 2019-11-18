package day04;

public class MultiArray2 {
    public static void main(String[] args) {
        /*
        調查五位學生之身高及體重如下，試比較其分散程度。
        身高：172、168、164、170、176(公分)
        體重：62、57、58、64、64(公斤)
        */
        int[][] data = {
            {172,168,164,170,176},
            {62,57,58,64,64}
        };
        System.out.println(getCV(data[0]));
        System.out.println(getCV(data[1]));
    }
    // 總和
    public static double getSum(int [] m) {
        double sum = 0;
        for(int i=0, len=m.length;i<len;i++) {
            sum += m[i];
        }
        return sum;
    }
    // 平均
    public static double getAvg(int [] m) {
        double sum = getSum(m);
        return sum / m.length;
    }
    // 標準差
    public static double getStd(int [] m) {
        double avg = getAvg(m);
        
        double sum = 0;
        for(int i=0, len=m.length;i<len;i++) {
            sum += Math.pow(m[i]-avg, 2);
        }
        
        return Math.sqrt(sum/m.length);
    }
    
    // CV 變異係數
     public static double getCV(int [] m) {
         double s = getStd(m);
         double avg = getAvg(m);
         return s / avg;
     }
    
}
