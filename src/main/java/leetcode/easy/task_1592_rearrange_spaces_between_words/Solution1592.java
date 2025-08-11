package leetcode.easy.task_1592_rearrange_spaces_between_words;

import java.util.StringTokenizer;

public class Solution1592 {

    public String reorderSpaces(String text) {
        StringTokenizer tokenizer = new StringTokenizer(text, "{ }+");
        int wordsCount = tokenizer.countTokens();
        String[] words = new String[wordsCount];
        int wordsLength = 0;
        for (int i = 0; i < wordsCount; i++) {
            String next = tokenizer.nextToken();
            wordsLength += next.length();
            words[i] = next;
        }
        if (wordsCount == 1){
            return words[0] + " ".repeat(text.length()-wordsLength);
        }

        int spacesCount = words.length - 1;
        int spacesLength = text.length() - wordsLength;

        int singleSpaceLength = spacesLength / spacesCount;
        int trailingSpaceLength = spacesLength % spacesCount;

        return String.join(" ".repeat(singleSpaceLength), words) + " ".repeat(trailingSpaceLength);
    }
}
