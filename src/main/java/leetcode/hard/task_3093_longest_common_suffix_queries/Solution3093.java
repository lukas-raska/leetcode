package leetcode.hard.task_3093_longest_common_suffix_queries;

import java.util.Arrays;

class TrieNode {

    private final static int MAX_WORD_LENGTH = Integer.MAX_VALUE;
    private final static int ALPHABET_LENGTH = 'z' - 'a' + 1;
    int optimalWordIndex = 0;
    int minWordLength = MAX_WORD_LENGTH;
    TrieNode[] children;

    TrieNode() {
        children = new TrieNode[ALPHABET_LENGTH];
    }
}

public class Solution3093 {

    public int[] stringIndices(String[] wordsContainer,
                               String[] wordsQuery) {

        TrieNode root = createSuffixTrieNode(wordsContainer);
        int[] result = new int[wordsQuery.length];
        Arrays.fill(result, root.optimalWordIndex);

        for (int i = 0; i < wordsQuery.length; i++) {
            String query = wordsQuery[i];
            TrieNode current = root;
            for (int j = query.length() - 1; j >= 0; j--) {
                int idx = query.charAt(j) - 'a';
                if (current.children[idx] != null) {
                    current = current.children[idx];
                    result[i] = current.optimalWordIndex;
                } else {
                    break;
                }
            }
        }

        return result;
    }

    private TrieNode createSuffixTrieNode(String[] wordsContainer) {

        TrieNode root = new TrieNode();

        for (int i = 0; i < wordsContainer.length; i++) {

            TrieNode current = root;
            String word = wordsContainer[i];

            updateNodeProperties(root, word.length(), i);

            for (int j = word.length() - 1; j >= 0; j--) {
                char currentChar = word.charAt(j);
                int idx = currentChar - 'a';
                if (current.children[idx] == null) {
                    current.children[idx] = new TrieNode();
                }
                updateNodeProperties(current.children[idx], word.length(), i);
                current = current.children[idx];
            }
        }
        return root;
    }

    private void updateNodeProperties(TrieNode node,
                                      int wordLength,
                                      int index) {
        if (node.minWordLength > wordLength) {
            node.optimalWordIndex = index;
            node.minWordLength = wordLength;
        } else if (node.minWordLength == wordLength) {
            node.optimalWordIndex = Math.min(node.optimalWordIndex, index);
        }
    }

}
