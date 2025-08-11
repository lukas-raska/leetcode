package leetcode.medium.task_0869_reordered_power_of_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution0869 {

    public boolean reorderedPowerOf2(int n) {
        int[] powersOf2 = getAllPowersOf2();
        int[] digits = toDigits(n);
        Arrays.sort(digits);
        for (int power : powersOf2) {
            int[] powerDigits = toDigits(power);
            Arrays.sort(powerDigits);
            if (Arrays.equals(powerDigits, digits)) {
                return true;
            }
        }
        return false;
    }

    private int[] getAllPowersOf2() {
        int[] powers = new int[30];
        powers[0] = 1;
        for (int i = 1; i < powers.length; i++) {
            powers[i] = 2 * powers[i - 1];
        }
        return powers;
    }

    private int[] toDigits(int number) {
        int digitsCount = numberOfDigits(number);
        int[] digits = new int[digitsCount];
        if (number == 0) {
            digits[0] = 0;
        } else {
            int index = digitsCount - 1;
            while (number > 0) {
                digits[index] = number % 10;
                number /= 10;
                index--;
            }
        }
        return digits;
    }

    private int numberOfDigits(int n) {
        int count = 1;
        while (n >= 10) {
            count++;
            n /= 10;
        }
        return count;
    }
}
