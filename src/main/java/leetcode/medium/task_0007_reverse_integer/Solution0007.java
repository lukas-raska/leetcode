package leetcode.medium.task_0007_reverse_integer;

import java.util.ArrayList;
import java.util.List;

public class Solution0007 {

    public int reverse(int x) {

        long result = 0;
        long value = Math.abs((long) x);
        int sign = (x < 0) ? -1 : 1;

        List<Integer> digits = new ArrayList<>();
        while (value != 0) {
            digits.add((int) (value % 10));
            value /= 10;
        }

        long exp = (long) Math.pow(10, digits.size() - 1);
        for (int digit : digits) {
            result += digit * exp;
            exp /= 10;
        }
        result *= sign;

        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) result;

    }




}
