package leetcode.medium.task_3751_total_waviness_of_numbers_in_range_I;

public class Solution3751 {

    public int totalWaviness(int num1,
                             int num2) {
        int result = 0;
        for (int i = num1; i <= num2; i++) {
            result += getCountOfPeaksOrValleys(i);
        }
        return result;
    }

    private int getCountOfPeaksOrValleys(int num) {
        if (num <= 100) {
            return 0;
        }
        int result = 0;
        int[] digits = getDigits(num);
        for (int i = 1; i < digits.length - 1; i++) {
            int prev = digits[i - 1];
            int curr = digits[i];
            int next = digits[i + 1];
            if (prev < curr && next < curr || prev > curr && next > curr) {
                result++;
            }
        }
        return result;
    }

    private int[] getDigits(int num) {
        int[] result = new int[countDigits(num)];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = num % 10;
            num /= 10;
        }
        return result;
    }

    private int countDigits(int num) {
        int cnt = 1;
        while (num > 9) {
            num /= 10;
            cnt++;
        }
        return cnt;
    }
}
