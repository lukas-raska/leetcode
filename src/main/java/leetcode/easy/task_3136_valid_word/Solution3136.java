package leetcode.easy.task_3136_valid_word;

public class Solution3136 {

    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        boolean vowelFound = false;
        boolean consonantFound = false;
        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if (Character.isLetter(c)) {
                if (!vowelFound && isVowel(c)) {
                    vowelFound = true;
                }
                if (!consonantFound && !isVowel(c)) {
                    consonantFound = true;
                }
            }
        }
        return vowelFound && consonantFound;
    }


    private boolean isVowel(char c) {
        return "aeiouAEIOU".contains(String.valueOf(c));
    }
}
