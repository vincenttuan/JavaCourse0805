package exam.leetcode;

public class LeetCode_001 {
    public static void main(String[] args) {
        // 给定一個整数陣列 nums 和一個目標值 target，
        // 請你在該陣列中找出和為目標值的那二個整数
        // 例如 : 目標值 9, [0, 2]
        // 例如 : 目標值 13, [1, 2]
        int[] nums = {7, 11, 2, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.printf("目標值 %d, [%d, %d]\n", target, result[0], result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int len = nums.length;
        // 請撰寫
        for(int i=0;i<len-1;i++) {
            if(nums[i] >= target) continue;
            for(int j=i+1;j<len;j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
