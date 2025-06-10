package leetcode.easy.task_3442_maximum_difference_between_even_and_odd_frequency;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution3442 {

    public int maxDifference(String s) {
        int[] frequencies = new int['z' - 'a' + 1];
        for (char c : s.toCharArray()) {
            frequencies[c - 'a']++;
        }
        int maxEvenFr = 0;
        int minOddFr = Integer.MAX_VALUE;
        for (int fr : frequencies) {
            if (fr != 0) {
                if (fr % 2 == 0 && fr < minOddFr) {
                    minOddFr = fr;
                }
                if (fr % 2 != 0 && fr > maxEvenFr) {
                    maxEvenFr = fr;
                }
            }

        }
        return maxEvenFr - minOddFr;
    }

    public int maxDifference2(String s) {

        var frequencyMap = s.chars()
                .mapToObj(n -> (char) n)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        long maxOddFrequency = frequencyMap.values().stream()
                .filter(n -> n % 2 != 0)
                .max(Comparator.naturalOrder())
                .orElse(0L);

        long minEvenFrequency = frequencyMap.values().stream()
                .filter(n -> n % 2 == 0)
                .min(Comparator.naturalOrder())
                .orElse(0L);

        return (int) (maxOddFrequency - minEvenFrequency);
    }
}
