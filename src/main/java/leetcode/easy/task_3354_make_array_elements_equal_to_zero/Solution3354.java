package leetcode.easy.task_3354_make_array_elements_equal_to_zero;

import java.util.Arrays;

public class Solution3354 {

    public int countValidSelections(int[] nums) {
        int valid = 0;
        int sumOfAll = 0;
        for (int num : nums) {
            sumOfAll += num;
        }
        int sumOfLeft = 0;
        for (int i = 0; i < nums.length; i++) {
            sumOfLeft += nums[i];
            if (nums[i] == 0) {
                int sumOfRight = sumOfAll - sumOfLeft;
                int diff = Math.abs(sumOfLeft - sumOfRight);

                if (diff == 0) {
                    valid += 2;
                }
                if (diff == 1) {
                    valid++;
                }
            }
        }
        return valid;
    }

    public int countValidSelections2(int[] nums) {

        int valid = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (isResettable(nums, i, true)) {
                    valid++;
                }
                if (isResettable(nums, i, false)) {
                    valid++;
                }
            }
        }
        return valid;
    }

    private boolean isResettable(int[] nums,
                                 int startingIndex,
                                 boolean toTheRight) {
        int[] processed = Arrays.copyOf(nums, nums.length);
        int step = toTheRight ? 1 : -1;
        int i = startingIndex + step;


        while (i >= 0 && i < nums.length) {
            if (processed[i] > 0) {
                processed[i]--;
                step *= -1;

            }
            i += step;
        }

        for (int num : processed) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}
