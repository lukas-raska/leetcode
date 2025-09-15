package leetcode.easy.task_1935_maximum_number_of_words_you_can_type;

public class Solution1935 {

    public int canBeTypedWords(String text,
                               String brokenLetters) {
        int possible = 0;
        String[] words = text.split(" ");
        for (String word : words) {
            if (!contains(word,brokenLetters)){
                possible++;
            }
        }
        return possible;
    }

    private boolean contains(String word,
                             String brokenLetters) {
        for (char c : brokenLetters.toCharArray()) {
            if (word.contains("" + c)){
                return true;
            }
        }
        return false;
    }
}
