package leetcode.medium.task_2443_sum_of_number_and_its_reverse;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Solution2443 {

    public boolean sumOfNumberAndReverse(int num) {

        for (int i = (int) Math.pow(10, numberOfDigits(num) - 2); i <= num; i++) {
            if (i + reverse(i) == num) {
                return true;
            }
        }
        return false;
    }

    public int numberOfDigits(int num) {
        int count = 1;
        while (num >= 10) {
            num /= 10;
            count++;
        }
        return count;
    }

    public int reverse(int num) {
        int numberOfDigits = numberOfDigits(num);
        int reversed = 0;
        int exp = 10;
        while (num > 0) {
            reversed += (int) ((num % 10) * Math.pow(10, numberOfDigits - 1));
            num /= 10;
            numberOfDigits--;
        }
        return reversed;
    }
}
