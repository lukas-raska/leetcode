package leetcode.easy.task_3438_find_valid_pair_of_adjacent_digits_in_string;

public class Solution3438 {

    public String findValidPair(String s) {

        int[] freq = new int[10];
        for (char c : s.toCharArray()) {
            int val = Character.getNumericValue(c);
            freq[val]++;
        }

        String validPair = "";

        for (int i = 0; i < s.length() - 1; i++) {

            int a = Character.getNumericValue(s.charAt(i));
            int b = Character.getNumericValue(s.charAt(i + 1));
            if (a != b && freq[a] == a && freq[b] == b) {
                validPair = "" + a + b;
                break;
            }
        }

        return validPair;
    }
}
