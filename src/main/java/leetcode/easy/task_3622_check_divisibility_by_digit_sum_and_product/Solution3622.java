package leetcode.easy.task_3622_check_divisibility_by_digit_sum_and_product;

public class Solution3622 {

    public boolean checkDivisibility(int n) {

        int temp = n;
        int sum = 0;
        int product = 1;

        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += lastDigit;
            product *= lastDigit;
            temp /= 10;
        }

        return n % (sum + product) == 0;

    }
}
