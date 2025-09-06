package leetcode.medium.task_0015_3sum_unfinished;

import java.util.*;

public class Solution0015 {

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> triples = new HashSet<>();
        Arrays.sort(nums);
        for (int indexOfFirst = 0; indexOfFirst < nums.length-2; indexOfFirst++) {

            int indexOfSecond = indexOfFirst + 1;
            int indexOfThird = nums.length - 1;

            while (indexOfSecond < indexOfThird) {

                int currentSum = nums[indexOfFirst] + nums[indexOfSecond] + nums[indexOfThird];
                if (currentSum > 0) {
                    indexOfThird--;
                } else if (currentSum < 0) {
                    indexOfSecond++;
                } else {
                    triples.add(List.of(nums[indexOfFirst], nums[indexOfSecond], nums[indexOfThird]));
                    indexOfSecond++;
                    indexOfThird--;
                }
            }
        }


        return triples.stream().toList();
    }


}
