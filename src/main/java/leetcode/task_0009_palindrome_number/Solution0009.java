package leetcode.task_0009_palindrome_number;

public class Solution0009 {

    public boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
