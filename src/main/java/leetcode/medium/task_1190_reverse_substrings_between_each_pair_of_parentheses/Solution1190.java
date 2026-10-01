package leetcode.medium.task_1190_reverse_substrings_between_each_pair_of_parentheses;

public class Solution1190 {

    public String reverseParentheses(String s) {

        int[] openingParenthesesStock = new int[s.length()];
        int lastStocked = -1;
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            char c = sb.charAt(i);
            if (c == '(') {
                openingParenthesesStock[++lastStocked] = i;
            }
            if (c == ')') {
                int from = openingParenthesesStock[lastStocked--];
                String content = sb.substring(from + 1, i);
                String reversed = new StringBuilder(content).reverse().toString();
                sb.replace(from + 1, i, reversed);
            }
        }

        StringBuilder result = new StringBuilder(s.length());
        for(int i = 0; i< sb.length(); i++ ){
            char c = sb.charAt(i);
            if (c != '(' && c != ')'){
                result.append(c);
            }
        }

        return result.toString();
    }
}
