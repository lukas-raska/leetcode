package leetcode.task_0008.string_to_integer;

import java.util.regex.Pattern;

public class Solution0008 {

    public int myAtoi(String s) {

        if (s == null || s.isBlank()) {
            return 0;
        }

        s = s.trim();

        int sign = 1;
        int index = 0;

        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        int result = 0;

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = Character.digit(s.charAt(index), 10);
            try {
                result = Math.multiplyExact(result, 10);
                result = Math.addExact(result, digit);
            } catch (ArithmeticException e) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            index++;
        }
        return sign * result;
    }
}
