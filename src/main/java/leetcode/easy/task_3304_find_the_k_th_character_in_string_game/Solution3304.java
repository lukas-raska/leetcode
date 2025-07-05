package leetcode.easy.task_3304_find_the_k_th_character_in_string_game;

public class Solution3304 {

    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder(String.valueOf('a'));
        while (word.length() < k) {
            StringBuilder generated = new StringBuilder(word.length());
            for (int i = 0; i < word.length(); i++) {
                char current = word.charAt(i);
                generated.append((current == 'z') ? 'a' : (char) (current + 1));
            }
            word.append(generated);
        }
        return word.charAt(k - 1);
    }
}
