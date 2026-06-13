package leetcode.easy.task_0824_goat_latin;

import java.util.Set;

public class Solution824 {

    public String toGoatLatin1(String sentence) {
        final String delimiter = " ";
        String[] words = sentence.split(delimiter);
        int aCnt = 1;
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (startsWithVowel(word)) {
                result.append(word);

            } else {
                result.append(word.substring(1)).append(word.charAt(0));
            }

            result.append(suffix(aCnt++)).append(delimiter);
        }
        return result.toString().trim();
    }

    private boolean startsWithVowel(String word) {
        return Set.of('a', 'e', 'i', 'o', 'u').contains(word.charAt(0));
    }

    private String suffix(int cnt) {
        return "m" + "a".repeat(cnt);
    }



}
