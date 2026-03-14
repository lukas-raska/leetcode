package leetcode.medium.task_1415_the_k_th_lexicographical_string_of_all_happy_strings_of_length_n;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution1415 {

    private final static char[] CHARS = {'a', 'b', 'c'};
    private final static char UNUSED = '-';

    public String getHappyString(int n,
                                 int k) {
        List<String> happyStrings = new ArrayList<>();
        generateHappyStrings(happyStrings, "", n);
        if (happyStrings.size() < k) {
            return "";
        }
        return happyStrings.get(k - 1);
    }

    private void generateHappyStrings(List<String> happyStrings,
                                      String current,
                                      int length) {
        if (current.length() == length) {
            happyStrings.add(current);
            return;
        }
        char last = current.isEmpty() ? UNUSED : current.charAt(current.length() - 1);
        for (char c : CHARS) {
            if (c != last) {
                generateHappyStrings(happyStrings, current + c, length);
            }
        }
    }
}

