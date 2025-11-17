package leetcode.medium.task_1513_number_of_substrings_with_only_1s;

import java.util.Arrays;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution1513 {
    public int numSub(String s) {

        String[] ones = s.split("0+");
        long result = 0;
        for (String sub : ones) {
            int length = sub.length();
            result += (((long) length * (length + 1)) / 2) % 1_000_000_007;
        }
        return (int) result;
    }


}
