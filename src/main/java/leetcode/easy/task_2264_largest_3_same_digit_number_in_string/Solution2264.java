package leetcode.easy.task_2264_largest_3_same_digit_number_in_string;

public class Solution2264 {

    public String largestGoodInteger(String num) {
        String[] possibleResults = {"000", "111", "222", "333", "444", "555", "666", "777", "888", "999"};
        boolean[] found = new boolean[10];
        int indexOfFound = -1;
        for (int i = 0; i < num.length() - 2; i++) {
            String current = num.substring(i, i + 3);
            if (current.equals("999")) {
                return current;
            }
            if (isGood(current)) {
                indexOfFound = Character.digit(current.charAt(0), 10);
                found[indexOfFound] = true;
            }
        }
        for (int i = found.length - 1; i >= 0; i--) {
            if (found[i]) {
                return possibleResults[i];
            }
        }
        return "";
    }

    private boolean isGood(String s) {
        return s.charAt(0) == s.charAt(1) && s.charAt(0) == s.charAt(2);
    }
}
