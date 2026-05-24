package leetcode.easy.task_1752_check_if_array_is_sorted_and_rotated;

public class Solution1752 {

    public boolean check(int[] nums) {

        int n = nums.length;
        int breaksCnt = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                breaksCnt++;
            }
            if (breaksCnt > 1) {
                return false;
            }
        }
        return breaksCnt == 0 || nums[0] >= nums[n - 1];
    }
}
