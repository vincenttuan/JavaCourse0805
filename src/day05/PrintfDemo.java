package day05;

public class PrintfDemo {
    public static void main(String[] args) {
        
        char c = 'A';
        int x = 151;
        double y = 0.74;
        String s = "星巴克";
        
        System.out.println("我是" + s + "的" + c + "咖, 買" + x + "的咖啡可以打上" + y + ", 價格=" + (x * y));
        System.out.printf("我是%s的%c咖, 買%d的咖啡可以打上%.2f, 價格=%.1f\n", s, c, x, y, (x*y));
        
                
        
        
    }
}
