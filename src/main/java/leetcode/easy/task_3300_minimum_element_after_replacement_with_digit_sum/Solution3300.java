package leetcode.easy.task_3300_minimum_element_after_replacement_with_digit_sum;

public class Solution3300 {

    public int minElement(int[] nums) {
        final int possibleMin = 1;
        int foundMin = Integer.MAX_VALUE;
        for (int n : nums) {
            foundMin = Math.min(foundMin, sumDigits(n));
            if (foundMin == possibleMin) {
                break;
            }
        }
        return foundMin;

    }

    private int sumDigits(int num) {

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
