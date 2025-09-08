package leetcode.easy.task_1317_convert_integer_to_the_sum_of_two_non_zero_integers;

public class Solution1317 {

    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            if (isWithoutZeros(i) && isWithoutZeros(n - i)){
                return new int[]{i,n-i};
            }
        }
        return null;
    }

    private boolean isWithoutZeros(int n) {
        while (n > 0) {
            if (n % 10 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
