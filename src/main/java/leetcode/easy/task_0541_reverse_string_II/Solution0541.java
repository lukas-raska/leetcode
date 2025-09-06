package leetcode.easy.task_0541_reverse_string_II;

public class Solution0541 {

    public String reverseStr(String s,
                             int k) {

        StringBuilder result = new StringBuilder();
        boolean canReverse = true;
        int index = 0;
        while (index < s.length()) {
            int endIndex = Math.min((index + k), s.length());
            String current = s.substring(index, endIndex);
            String toAppend = canReverse ? new StringBuilder(current).reverse().toString() : current;
            result.append(toAppend);
            index += k;
            canReverse = !canReverse;
        }

        return result.toString();
    }
}
