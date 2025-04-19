package leetcode.task_2176_count_equal_and_divisible_pairs_in_an_array;

public class Solution2176 {

    public int countPairs(int[] nums,
                          int k) {
        int pairs = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
