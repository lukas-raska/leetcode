package leetcode.easy.task_2942_find_words_containing_character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution2942 {

    public List<Integer> findWordsContaining2(String[] words,
                                              char x) {
        return IntStream
                .range(0, words.length)
                .filter(i -> words[i].contains("" + x))
                .boxed()
                .toList();
    }

    public List<Integer> findWordsContaining1(String[] words,
                                              char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("" + x)) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> findWordsContaining(String[] words,
                                             char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                if (c == x) {
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }


}
