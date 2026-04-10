package leetcode.easy.task_1309_decrypt_string_from_alphabet_to_integer_mapping;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution1309 {

    public String freqAlphabets(String s) {

        StringBuilder result = new StringBuilder();
        int index = s.length() - 1;

        while (index >= 0) {
            char curr = s.charAt(index);
            int charNo = (curr == '#') ? Integer.parseInt(s.substring(index - 2, index)) :
                    Character.getNumericValue(curr);
            index = (curr == '#') ? index - 3 : index - 1;
            char decoded = (char) ('a' - 1 + charNo);
            result.append(decoded);
        }
        return result.reverse().toString();

    }
}
