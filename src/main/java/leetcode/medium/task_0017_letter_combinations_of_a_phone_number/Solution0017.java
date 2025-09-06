package leetcode.medium.task_0017_letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution0017 {

    private final static String[] KEYBOARD_MAP = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {

        List<String> output = new ArrayList<>();
        if (!digits.isEmpty()) {
            traverse(output, new StringBuilder(), digits, 0);
        }

        return output;
    }

    private void traverse(List<String> output,
                          StringBuilder current,
                          String digits,
                          int index) {
        if (index == digits.length()) {
            output.add(current.toString());
            return;
        }
        int currentDigit = Character.getNumericValue(digits.charAt(index));

        for (char c : KEYBOARD_MAP[currentDigit].toCharArray()) {
            current.append(c);
            traverse(output, current, digits, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
