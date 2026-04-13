package leetcode.medium.task_0018_4sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution18 {

    public List<List<Integer>> fourSum(int[] nums,
                                       int target) {

        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (target >= 0 && nums[i] > target) {
                break;
            }
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                long sumAB = nums[i] + nums[j];
                if (target >= 0 && sumAB > target) {
                    break;
                }
                long rest = target - sumAB;
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long sumLR = nums[left] + nums[right];
                    if (sumLR == rest) {
                        results.add(List.of(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]){
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]){
                            right--;
                        }

                        left++;
                        right--;
                    } else if (sumLR < rest) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return results;
    }
}
