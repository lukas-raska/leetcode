package leetcode.easy.task_3345_smallest_divisible_digit_product_I;

public class Solution3345 {

    public int smallestNumber(int n,
                              int t) {
        while (true) {
            int p = getDigitsProduct(n);
            if (p % t == 0) {
                return n;
            }
            n++;
        }
    }

    private int getDigitsProduct(int n) {
        if (n < 0) {
            n *= -1;
        }
        if (n < 10) {
            return n;
        }
        int result = n % 10;
        n /= 10;
        while (n > 0) {
            result *= (n % 10);
            n /= 10;
        }
        return result;
    }
}
