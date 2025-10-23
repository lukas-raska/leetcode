package leetcode.easy.task_3461_check_if_digits_are_equal_in_string_after_operations_I;

public class Solution3461 {

    public boolean hasSameDigits(String s) {

        var digits = mapToIntArray(s);
        while (digits.length > 2) {
            digits = reduce(digits);
        }

        return digits[0] == digits[1];
    }

    private int[] reduce(int[] arr) {
        int[] res = new int[arr.length - 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = (arr[i] + arr[i + 1]) % 10;
        }
        return res;
    }

    private int[] mapToIntArray(String digits) {
        int[] res = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            res[i] = Integer.parseInt(String.valueOf(digits.charAt(i)));
        }
        return res;
    }
}
