package leetcode.easy.task_0976_largest_perimeter_triangle;

import java.util.Arrays;

public class Solution0976 {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            int largest = nums[i];
            int secondLargest = nums[i - 1];
            int thirdLargest = nums[i - 2];
            if (largest < secondLargest + thirdLargest) {
                return largest + secondLargest + thirdLargest;
            }
        }
        return 0;
    }
}
