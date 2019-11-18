package day08_extends;

public class Varage {
    public static void main(String[] args) {
        Varage v = new Varage();
        int[] nums = {100, 90, 80};
        System.out.println(v.calc(nums));
        System.out.println(v.calc(100, 90, 80));
        System.out.println(v.calc(100, 90, 80, 60, 50));
        System.out.println(v.calc(100));
        System.out.println(v.calc());
    }
    
    public int calc(int... nums) {
        int sum = 0;
        for(int n : nums) {
            sum += n;
        }
        return sum;
    }
}
