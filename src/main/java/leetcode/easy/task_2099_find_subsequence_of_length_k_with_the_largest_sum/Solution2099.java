package leetcode.easy.task_2099_find_subsequence_of_length_k_with_the_largest_sum;

import java.util.*;
import java.util.stream.Collectors;

public class Solution2099 {



    public int[] maxSubsequence(int[] nums,
                                int k) {
        record IndexedNumber(int value, int index) {

        }
        List<IndexedNumber> indexedNumbers = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            indexedNumbers.add(new IndexedNumber(nums[i], i));
        }
        return indexedNumbers.stream()
                .sorted(Comparator.comparing(IndexedNumber::value).reversed())
                .limit(k)
                .sorted(Comparator.comparing(IndexedNumber::index))
                .mapToInt(n -> n.value)
                .toArray();

    }

    public int[] maxSubsequence2(int[] nums,
                                 int k) {

        List<Integer> sublist = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        while (sublist.size() > k) {
            int min = sublist.stream()
                    .min(Integer::compareTo)
                    .orElseThrow();
            sublist.remove(Integer.valueOf(min));
        }
        return sublist.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
