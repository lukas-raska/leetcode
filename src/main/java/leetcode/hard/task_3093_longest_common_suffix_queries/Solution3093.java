package leetcode.hard.task_3093_longest_common_suffix_queries;

class TrieNode {

    private final static int MAX_WORD_LENGTH = 5_001;
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

        for (int i = 0; i < wordsQuery.length; i++) {
            String query = wordsQuery[i];
            TrieNode current = root;
            boolean foundMatch = false;
            for (int j = query.length() - 1; j >= 0; j--) {
                int idx = query.charAt(j) - 'a';
                if (current.children[idx] != null) {
                    result[i] = current.children[idx].optimalWordIndex;
                    foundMatch = true;
                } else {
                    if (!foundMatch) {
                        result[i] = root.optimalWordIndex;
                    }
                    break;
                }
                current = current.children[idx];
            }
        }

        return result;
    }

    private TrieNode createSuffixTrieNode(String[] wordsContainer) {

        TrieNode root = new TrieNode();

        for (int i = 0; i < wordsContainer.length; i++) {

            TrieNode current = root;
            String word = wordsContainer[i];

            for (int j = word.length() - 1; j >= 0; j--) {
                char currentChar = word.charAt(j);
                int idx = currentChar - 'a';

                if (current.children[idx] == null) {
                    current.children[idx] = new TrieNode();
                }

                if (word.length() < root.minWordLength) {
                    root.optimalWordIndex = i;
                    root.minWordLength = word.length();
                }

                if (word.length() < current.children[idx].minWordLength) {
                    current.children[idx].optimalWordIndex = i;
                    current.children[idx].minWordLength = word.length();


                } else if (word.length() == current.children[idx].minWordLength) {
                    current.children[idx].optimalWordIndex = Math.min(i, current.children[idx].optimalWordIndex);
                    root.optimalWordIndex = Math.min(i, root.optimalWordIndex);
                }

                current = current.children[idx];
            }

        }
        return root;
    }

}
