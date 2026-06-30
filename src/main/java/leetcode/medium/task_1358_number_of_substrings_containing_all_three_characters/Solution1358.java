package leetcode.medium.task_1358_number_of_substrings_containing_all_three_characters;

public class Solution1358 {

    public int numberOfSubstrings(String s) {

        int n = s.length();
        int[] abcFreq = new int[3];

        int count = 0;
        int left = 0;
        int right = 1;
        char leftChar = s.charAt(left);
        char rightChar = s.charAt(right);
        abcFreq[leftChar - 'a']++;
        abcFreq[rightChar - 'a']++;

        while (true) {
            if (abcFreq[0] > 0 && abcFreq[1] > 0 && abcFreq[2] > 0) {
                count += (s.length() - right);
                abcFreq[leftChar - 'a']--;
                leftChar = s.charAt(++left);

            } else {
                right++;
                if (right == n){
                    break;
                }
                rightChar = s.charAt(right);
                abcFreq[rightChar - 'a']++;

            }
        }
        return count;
    }
}
