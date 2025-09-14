package leetcode.easy.task_3541_find_most_frequent_vowel_and_consonant;

import java.util.*;
import java.util.stream.Collectors;

public class Solution3541 {


    public int maxFreqSum(String s) {

        Map<Character, Integer> vowelsFrqMap = new HashMap<>();
        Map<Character, Integer> consonantFrqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowelsFrqMap.merge(c, 1, Integer::sum);
            } else {
                consonantFrqMap.merge(c, 1, Integer::sum);
            }
        }
        int vowelMaxFrq = getMaxValue(vowelsFrqMap.values());
        int consonantMaxFrq = getMaxValue(consonantFrqMap.values());

        return vowelMaxFrq + consonantMaxFrq;
    }

    private int getMaxValue(Collection<Integer> collection) {
        int max = 0;
        for (int n : collection) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    private boolean isVowel(char c) {
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
}
