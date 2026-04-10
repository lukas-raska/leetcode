package leetcode.easy.task_2520_count_the_digits_that_divide_a_number;

public class Solution2520 {

    public int countDigits(int num) {

        int cnt = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0 && num % digit == 0) {
                cnt++;
            }
            temp/=10;
        }

        return cnt;
    }
}
