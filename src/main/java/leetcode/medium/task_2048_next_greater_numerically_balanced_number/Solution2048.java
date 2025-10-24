package leetcode.medium.task_2048_next_greater_numerically_balanced_number;

public class Solution2048 {

    public int nextBeautifulNumber(int n) {
        while (true) {
            if (isBalanced(++n)) {
                return n;
            }
        }
    }

    private boolean isBalanced(int n) {
        final int[] digitsFrequency = new int[10];
        while (n > 0) {
            int curr = n % 10;
            if (++digitsFrequency[curr] > curr) {
                return false;
            }
            n /= 10;
        }
        for (int i = 1; i < digitsFrequency.length; i++) {
            if (digitsFrequency[i] > 0 && digitsFrequency[i] != i) {
                return false;
            }
        }
        return true;
    }
}
