package leetcode.medium.task_0179_largest_number;

import java.util.*;
import java.util.stream.Collectors;

public class Solution179 {

    public String largestNumber(int[] nums) {

        int length = nums.length;

        String[] mappedToString = new String[length];
        for (int i = 0; i < length; i++) {
            mappedToString[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(mappedToString, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        if (Objects.equals(mappedToString[0], "0")){
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for(String s:mappedToString){
            result.append(s);
        }

        return result.toString();
    }
}
