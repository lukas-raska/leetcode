package leetcode.easy.task_1323_maximum_69_number;

public class Solution1323 {

    public int maximum69Number(int num) {
        if (num < 10) {
            return 9;
        }
        int[] digits = toDigits(num);

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 6) {
                digits[i] = 9;
                break;
            }
        }
        return toNumber(digits);
    }


    public int[] toDigits(int num) {
        int numberOfDigits = numberOfDigits(num);
        int[] digits = new int[numberOfDigits];
        for (int i = numberOfDigits - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public int toNumber(int[] digits) {
        int num = 0;
        int exp = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            num += digits[i] * exp;
            exp *= 10;
        }
        return num;
    }

    public int numberOfDigits(int num) {
        int count = 1;
        while (num > 10) {
            count++;
            num /= 10;
        }
        return count;
    }
}
