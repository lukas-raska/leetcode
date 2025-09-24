package leetcode.easy.task_1859_sorting_the_sentence;

public class Solution1859 {

    public String sortSentence(String s) {

        String[] unsorted = s.split(" ");
        String[] sorted = new String[unsorted.length];

        for (int i = 0; i < unsorted.length; i++) {
            int idx = Character.getNumericValue(unsorted[i].charAt(unsorted[i].length() - 1))-1;
            String word = unsorted[i].substring(0, unsorted[i].length() - 1);
            sorted[idx] = word;
        }
        return String.join(" ", sorted);
    }
}
