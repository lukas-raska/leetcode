package leetcode.easy.task_2729_check_if_the_number_is_fascinating;

public class Solution2729 {

    public boolean isFascinating(int n) {

        int[] digitsFrequencies = new int[10];
        long concatenated = concat(3 * n, 2 * n, n);

        while (concatenated > 1) {
            int lastDigit = Math.toIntExact(concatenated % 10);
            if (lastDigit == 0) {
                return false;
            }
            digitsFrequencies[lastDigit]++;
            if (digitsFrequencies[lastDigit] > 1) {
                return false;
            }
            concatenated /= 10;
        }
        return true;
    }

    public long concat(int... numbers) {
        long concatenated = 0;
        int exp = 1;
        for (int number : numbers) {
            concatenated += (long) exp * number;
            exp *= (number > 999) ? 10000 : 1000;
        }
        return concatenated;
    }
}
