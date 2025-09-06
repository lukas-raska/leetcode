package leetcode.easy.task_2094_finding_3digit_even_numbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Solution2094 {

    //233 ms
    public int[] findEvenNumbers2(int[] digits) {
        Set<Integer> results = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2 == 0) {
                for (int j = 0; j < digits.length; j++) {
                    if (j != i) {
                        for (int k = 0; k < digits.length; k++) {
                            if (k != j && k != i && digits[k] != 0) {
                                results.add(100 * digits[k] + 10 * digits[j] + digits[i]);
                            }
                        }
                    }
                }
            }
        }
        return results.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();

    }

    public int[] findEvenNumbers(int[] digits) {

        return IntStream.rangeClosed(100, 998)
                .filter(n -> n % 2 == 0)
                .filter(n-> isValid(n,digits))
                .sorted().toArray();
    }

    public boolean isValid(int number,
                           int[] digits) {
        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number % 10;

        int indexOfThird = -1;
        int indexOfSecond = -1;
        int indexOfFirst = -1;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == thirdDigit) {
                indexOfThird = i;
                break;
            }
        }

        if (indexOfThird < 0) {
            return false;
        }

        for (int i = 0; i < digits.length; i++) {
            if (i == indexOfThird) {
                continue;
            }
            if (digits[i] == secondDigit) {
                indexOfSecond = i;
                break;
            }
        }

        if (indexOfSecond < 0) {
            return false;
        }

        for (int i = 0; i < digits.length; i++) {
            if (i == indexOfThird || i == indexOfSecond) {
                continue;
            }
            if (digits[i] == firstDigit) {
                indexOfFirst = i;
                break;
            }
        }

        if (indexOfFirst < 0) {
            return false;
        }
        return true;
    }

}
