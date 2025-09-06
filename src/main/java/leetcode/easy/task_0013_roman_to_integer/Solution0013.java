package leetcode.easy.task_0013_roman_to_integer;

import java.util.Map;
import java.util.Optional;

public class Solution0013 {

    public int romanToInt(String s) {

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);
            char next = (i + 1 < s.length()) ? s.charAt(i + 1) : '?';

            result += switch (current) {
                case 'I' -> (next == 'V' || next == 'X') ? -1 : 1;
                case 'V' -> 5;
                case 'X' -> (next == 'L' || next == 'C') ? -10 : 10;
                case 'L' -> 50;
                case 'C' -> (next == 'D' || next == 'M') ? -100 : 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> throw new IllegalArgumentException("Invalid input. Unknown Roman symbol: " + current);
            };
        }
        return result;
    }
}

