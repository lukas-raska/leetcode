package leetcode.easy.task_2496_maximum_value_of_a_string_in_an_array;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2496 {

    public int maximumValue(String [] strs){
        return Arrays.stream(strs)
                .map(s-> s.matches("\\d+")? Integer.parseInt(s):s.length() )
                .max(Comparator.naturalOrder())
                .orElseThrow();
    }



    public int maximumValue2(String[] strs) {
        int max = 0;
        for (String s : strs) {
            int value = containsDigitsOnly(s) ? Integer.parseInt(s) : s.length();
            max = Math.max(max, value);
        }
        return max;
    }

    private boolean containsDigitsOnly(String s) {
        for (char c : s.toCharArray()) {
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
