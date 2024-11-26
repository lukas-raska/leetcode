package leetcode.task_976_largest_perimeter_triangle;

import java.util.Arrays;

public class Main976 {

    public static void main(String[] args) {

    }

    public static int largestPerimeter(int[] nums) {
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
