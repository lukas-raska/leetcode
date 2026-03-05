package leetcode.easy.task_1758_minimum_changes_to_make_alternating_binary_string;

public class Solution1758 {

    public int minOperations(String s) {

            int diffStartWith0 = 0; // 0101...
            int diffStartWith1 = 0; // 1010...

            for (int i = 0; i < s.length(); i++) {
                char current = s.charAt(i);

                char expected0 = (i % 2 == 0) ? '0' : '1';
                char expected1 = (i % 2 == 0) ? '1' : '0';

                if (current != expected0) diffStartWith0++;
                if (current != expected1) diffStartWith1++;
            }

            return Math.min(diffStartWith0, diffStartWith1);
    }
}
