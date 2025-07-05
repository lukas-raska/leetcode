package leetcode.easy.task_3079_find_the_sum_of_encrypted_integers;

public class Solution3079 {

    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += encrypt(n);
        }
        return sum;
    }

    private int encrypt(int x) {
        if (x < 10) {
            return x;
        }
        int result = 0;
        int digitsCounter = 0;
        int maxDigit = 0;

        while (x >= 1) {
            int digit = x % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            x /= 10;
            digitsCounter++;
        }
        for (int e = 0; e < digitsCounter; e++) {
            result += maxDigit * (int) Math.pow(10, e);
        }
        return result;
    }
}
