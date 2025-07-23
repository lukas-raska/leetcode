package leetcode.easy.task_1957_delete_characters_to_make_fancy_string;

import java.util.ArrayList;
import java.util.List;

public class Solution1957 {

    public String makeFancyString(String s) {
        StringBuilder fancyResult = new StringBuilder(s.length());
        fancyResult.append(s.charAt(0));
        int countOfRepeat = 0;
        for (int i = 1; i < s.length(); i++) {
            char prev = fancyResult.charAt(fancyResult.length() - 1);
            char current = s.charAt(i);
            if (current == prev) {
                countOfRepeat++;
            } else {
                countOfRepeat = 0;
            }

            if (countOfRepeat < 2) {
                fancyResult.append(current);
            }
        }
        return fancyResult.toString();
    }


}
