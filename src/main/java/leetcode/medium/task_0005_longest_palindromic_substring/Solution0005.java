package leetcode.medium.task_0005_longest_palindromic_substring;

public class Solution0005 {

    public String longestPalindrome(String s) {
        int possiblePalidromeLength = s.length();
        while (possiblePalidromeLength > 0) {
            for (int i = 0; i <= s.length() - possiblePalidromeLength; i++) {
                String substring = s.substring(i, i + possiblePalidromeLength);
                if (isPalindrome(substring)) {
                    return substring;
                }
            }
            possiblePalidromeLength--;
        }
        return "";
    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            char first = s.charAt(i);
            char last = s.charAt(s.length() - 1 - i);
            if (first != last) {
                return false;
            }
        }
        return true;
    }


}
