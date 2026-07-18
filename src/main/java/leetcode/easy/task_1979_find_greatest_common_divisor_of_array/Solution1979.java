package leetcode.easy.task_1979_find_greatest_common_divisor_of_array;

public class Solution1979 {

    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return gcd(min, max);
    }

    private int gcd(int min,
                    int max) {
        for (int i = min; i > 1; i--) {
            if (min % i == 0 && max % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
