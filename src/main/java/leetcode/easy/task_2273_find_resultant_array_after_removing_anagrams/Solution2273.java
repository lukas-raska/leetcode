package leetcode.easy.task_2273_find_resultant_array_after_removing_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2273 {

    public List<String> removeAnagrams(String[] words) {
        final List<String> result = new ArrayList<>(List.of(words[0]));
        for (int i = 1; i < words.length; i++) {
            if (!areAnagrams(words[i], words[i - 1])) {
                result.add(words[i]);
            }
        }
        return result;
    }


    private boolean areAnagrams(String s1,
                                String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        final int[] frequencies = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            frequencies[s1.charAt(i) - 'a']++;
            frequencies[s2.charAt(i) - 'a']--;
        }
        for (int count : frequencies) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }


}
