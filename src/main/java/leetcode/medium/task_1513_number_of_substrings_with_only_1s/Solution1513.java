package leetcode.medium.task_1513_number_of_substrings_with_only_1s;

import java.util.Arrays;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution1513 {
    public int numSub2(String s) {

        String[] ones = s.split("0+");
        long result = 0;
        for (String sub : ones) {
            int length = sub.length();
            result += (((long) length * (length + 1)) / 2) % 1_000_000_007;
        }
        return (int) result;
    }

    public int numSub(String s) {
        long result = 0;
        int currentLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1') {
                currentLength++;
            }
            if (c == '0' || i == s.length() - 1) {
                result += (((long) currentLength * (currentLength + 1)) / 2) % 1_000_000_007;
                currentLength = 0;
            }
        }

        return (int) result;
    }


}
