package leetcode.quests.dataStructuresAndAlgorithms.array_II.Q2_howManyNumbersAreSmallerThanTheCurrentNumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SolutionQ2 {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int[] copyNums = Arrays.copyOf(nums, n);
        Arrays.sort(copyNums);
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.putIfAbsent(copyNums[i], i );
        }

        for (int i = 0; i < n; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;
    }



}
