package leetcode.easy.task_3289_the_two_sneaky_numbers_of_digitville;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution3289 {

    public int[] getSneakyNumbers(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }

    public int[] getSneakyNumbers2(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int[] result = new int[2];
        int resIdx = 0;
        for (int num : nums) {
            if (numSet.contains(num)) {
                result[resIdx++] = num;
            } else {
                numSet.add(num);
            }
            if (resIdx > 1) {
                break;
            }
        }
        return result;
    }

    public int[] getSneakyNumbers4(int[] nums) {
        int[] res = new int[2];
        Arrays.sort(nums);
        for (int i = 1, resIdx = 0; i < nums.length && resIdx < 2; i++) {
            if (nums[i] == nums[i - 1]) {
                res[resIdx++] = nums[i];
            }
        }
        return res;
    }

    public int[] getSneakyNumbers3(int[] nums) {
        int[] res = new int[2];
        boolean[] used = new boolean[nums.length - 2];
        for (int i = 0, j = 0; i < nums.length && j < res.length; i++) {
            int curr = nums[i];
            if (!used[curr]){
                used[curr]=true;
            } else {
                res[j++]=curr;
            }
        }
        return res;
    }


    /*
    součet nums = 11
    součet bez duplicit = 6
    duplcity = 5
    znám nums.length 6 -> 4 + 2 duplicitní 0,1,2,3 + ?, ?
     */
}
