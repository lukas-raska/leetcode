package leetcode.task_0012_integer_to_roman;

public class Solution0012 {

    public String intToRoman(int num) {

        if (num <= 0 || num >= 4000) {
            throw new IllegalArgumentException("Invalid input. Cannot convert number: " + num);
        }

        StringBuilder convertedResult = new StringBuilder();

        String[] decimalSymbols = {"M", "C", "X", "I"};
        String[] fiveSymbols = {"-", "D", "L", "V"};

        int[] digits = digits(num);

        for (int i = 0; i < digits.length; i++) {
            int currentDigit = digits[i];
            if (currentDigit == 0) {
                continue;
            }
            convertedResult.append(
                    switch (currentDigit) {
                        case 1, 2, 3 -> decimalSymbols[i].repeat(currentDigit);
                        case 4 -> decimalSymbols[i] + fiveSymbols[i];
                        case 5 -> fiveSymbols[i];
                        case 6, 7, 8 -> fiveSymbols[i] + decimalSymbols[i].repeat(currentDigit - 5);
                        case 9 -> decimalSymbols[i] + decimalSymbols[i - 1];
                        default -> "?";
                    }
            );
        }
        return convertedResult.toString();
    }

    private int[] digits(int num) {

        int[] digits = new int[4];
        int indexOfDigit = digits.length - 1;

        while (num != 0) {
            digits[indexOfDigit--] = num % 10;
            num /= 10;
        }
        return digits;
    }

}

