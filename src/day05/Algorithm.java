package day05;

import java.util.ArrayList;
import java.util.Random;

public class Algorithm {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        
        WhileLoop:
        while (nums.size() < 5) {
            int n = new Random().nextInt(10) + 1;
            for(int num : nums) {
                //System.out.printf("nums = %s, num = %d, n = %d\n", nums, num, n);
                if(num == n) {
                    continue WhileLoop;
                }
            }
            nums.add(n);
        }
        System.out.println(nums);
    }
}
