package leetcode.easy.task_3005_count_element_with_maximum_frequency;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution3005 {

    public int maxFrequencyElements2(int[] nums) {
        var frequencyMap = Arrays
                .stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long maxFrq = Collections.max(frequencyMap.values());

        return (int) frequencyMap.values().stream()
                .filter(f -> f == maxFrq)
                .mapToLong(Long::longValue)
                .sum();
    }

    public int maxFrequencyElements(int[] nums) {

        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.merge(num, 1, Integer::sum);
        }

        int max = Collections.max(frequencyMap.values());
        int sum = 0;

        for (int frq : frequencyMap.values()) {
            if (frq == max){
                sum+=frq;
            }
        }
        return sum;
    }
}
