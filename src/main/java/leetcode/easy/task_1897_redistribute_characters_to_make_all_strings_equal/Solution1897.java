package leetcode.easy.task_1897_redistribute_characters_to_make_all_strings_equal;

public class Solution1897 {

    public boolean makeEqual(String[] words) {

        int[] frequencies = new int['z' - 'a' + 1];
        for (String word : words) {
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                frequencies[index]++;
            }
        }

        for (int freq : frequencies) {
            if (freq > 0 && freq % words.length != 0) {
                return false;
            }
        }
        return true;
    }


}
