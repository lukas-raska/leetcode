package leetcode.easy.task_1967_number_of_strings_that_appear_as_substring_in_word;

public class Solution1967 {

    public int numOfStrings(String[] patterns,
                            String word) {

        int match = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                match++;
            }
        }
        return match;
    }
}
