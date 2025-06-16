package leetcode.easy.task_2566_maximum_difference_by_remapping_a_digit;

import java.util.ArrayList;
import java.util.List;

public class Solution2566 {

    public int minMaxDifference(int num) {
        List<Integer> digits = getDigits(num);
        int remappingUpNumber = digits.getFirst();
        int remappingDownNumber = digits.getFirst();
        int length = digits.size();
        int[] mappedToMax = new int[length];
        int[] mappedToMin = new int[length];
        for (int i = 0; i < length; i++) {
            int current = digits.get(i);
            if (current != remappingDownNumber) {
                mappedToMin[i] = current;
            }
            if (current == remappingUpNumber) {
                mappedToMax[i] = 9;
                if (remappingUpNumber == 9 && i < length - 1) {
                    remappingUpNumber = digits.get(i + 1);
                }
            } else {
                mappedToMax[i] = current;
            }
        }
        return getNumber(mappedToMax) - getNumber(mappedToMin);
    }

    public int getNumber(int[] digits) {
        int result = 0;
        int length = digits.length;
        for (int i = 0; i < length; i++) {
            result += digits[i] * (int) Math.pow(10, length - 1 - i);
        }
        return result;
    }

    public List<Integer> getDigits(int num) {
        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.addFirst(num % 10);
            num /= 10;
        }
        return digits;
    }
}
