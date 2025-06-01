package leetcode.easy.task_2894_divisible_and_non_divisible_sums_difference;

public class Solution2894 {

    public int differenceOfSums(int n,
                                int m) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }
        return num1-num2;
    }
}
