package leetcode.easy.task_1614_maximum_nesting_depth_of_the_parentheses;

public class Solution1614 {

    public int maxDepth(String s) {

        int maxDepth = 0;
        int currentDepth = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                currentDepth++;
            }
            if (c == ')') {
                currentDepth--;
            }
            maxDepth = Math.max(maxDepth, currentDepth);
        }

        return maxDepth;

    }
}
