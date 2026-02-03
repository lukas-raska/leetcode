package leetcode.easy.task_3637_trionic_array_I;

public class Solution3637 {


    public boolean isTrionic(int[] nums) {

        if (nums.length <= 3) {
            return false;
        }

        int idx = 0;

        idx = walk(nums, idx, 1);   // rostoucí část
        if (idx == -1) {
            return false;
        }

        idx = walk(nums, idx, -1);  // klesající část
        if (idx == -1) {
            return false;
        }

        idx = walk(nums, idx, 1);   // opět rostoucí část
        if (idx == -1) {
            return false;
        }

        return idx == nums.length - 1;
    }


    private int walk(int[] nums,
                     int start,
                     int direction) {
        int idx = start;

        while (idx < nums.length - 1 &&
                (nums[idx + 1] - nums[idx]) * direction > 0) {
            idx++;
        }

        return idx == start ? -1 : idx;
    }
}



