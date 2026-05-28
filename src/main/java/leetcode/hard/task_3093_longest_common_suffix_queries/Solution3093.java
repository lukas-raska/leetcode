package leetcode.hard.task_3093_longest_common_suffix_queries;

public class Solution3093 {

    static class TrieNode {
        TrieNode[] children;

        TrieNode() {
            children = new TrieNode['z' - 'a' + 1];
        }
    }

    public int[] stringIndices(String[] wordsContainer,
                               String[] wordsQuery) {

        TrieNode root = new TrieNode();
        for(String word: wordsContainer){
            insertReversedWord(root,word);
        }

        int [] result = new int[wordsQuery.length];
        for (int i = 0; i < wordsQuery.length; i++){
            String commonSuffix = getCommonSuffix(root,wordsQuery[i]);
            int minLength = Integer.MAX_VALUE;
            for (int j = 0; j < wordsContainer.length; j++) {
                if (wordsContainer[j].endsWith(commonSuffix) && wordsContainer[j].length() < minLength){
                    minLength = wordsContainer[j].length();
                    result[i]= j;
                }
            }
        }

        return result;

    }

    private void insertReversedWord(TrieNode root,
                                    String word) {
        TrieNode current = root;
        for (int i = word.length() - 1; i >= 0; i--) {
            int idx = word.charAt(i)- 'a';
            if (current.children[idx] == null){
                current.children[idx] = new TrieNode();
            }
            current = current.children[idx];
        }
    }

    private String getCommonSuffix(TrieNode root, String query){

        StringBuilder commonSuffix = new StringBuilder();
        TrieNode current = root;

        for (int i = query.length()-1; i >=0 ; i--) {
            int idx = query.charAt(i) - 'a';
            if (current.children[idx]!= null){
                commonSuffix.append(query.charAt(i));
                current = current.children[idx];
            } else {
                break;
            }
        }
        return commonSuffix.reverse().toString();
    }
}
