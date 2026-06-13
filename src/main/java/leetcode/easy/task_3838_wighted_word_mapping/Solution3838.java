package leetcode.easy.task_3838_wighted_word_mapping;

import java.util.Arrays;

public class Solution3838 {

    public String mapWordWeights(String[] words,
                                 int[] weights) {

        StringBuilder mappedWord = new StringBuilder(words.length);

        for (String word : words) {

            int weight = 0;
            for (char c : word.toCharArray()) {
                weight += weights[c - 'a'];
            }
            weight %= weights.length;
            mappedWord.append((char)('z' - weight));
        }
        return mappedWord.toString();
    }




}
