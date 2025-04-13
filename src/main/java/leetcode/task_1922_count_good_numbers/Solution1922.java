package leetcode.task_1922_count_good_numbers;

import java.util.Arrays;

public class Solution1922 {

    public int countGoodNumbers(long n) {
        int count = 0;
        int[] smallPrimes = {2, 3, 5, 7};
        String convertedInput = String.valueOf(n);
        for (int i = 0; i < convertedInput.length(); i++) {
            int currentDigit = Character.getNumericValue(convertedInput.charAt(i));
            if (i % 2 == 0) {
                if (currentDigit % 2 == 0) {
                    count++;
                }
            } else {
                if (Arrays.stream(smallPrimes).anyMatch(num -> num == currentDigit)) {
                    count++;
                }
            }

        }
        return count;
    }
}
