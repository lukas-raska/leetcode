package leetcode.medium.task_3121_count_the_number_of_special_characters_II;

import java.util.Arrays;

public class Solution3121 {

    public int numberOfSpecialChars(String word) {

        int alphabetLength = 'Z' - 'A' + 1;
        int result = 0;
        int[] azLastOccur = new int[alphabetLength];
        int[] AZFirstOccur = new int[alphabetLength];
        Arrays.fill(azLastOccur, -1);
        Arrays.fill(AZFirstOccur, -1);

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            if (current >= 'a' && current <= 'z') {
                azLastOccur[current - 'a'] = i;
            }
            if (current >= 'A' && current <= 'Z' && AZFirstOccur[current - 'A'] == -1) {
                AZFirstOccur[current - 'A'] = i;
            }
        }

        for (int i = 0; i < alphabetLength; i++) {
            if (azLastOccur[i] == -1 || AZFirstOccur[i]== -1){
                continue;
            }
            if (azLastOccur[i] < AZFirstOccur[i]) {
                result++;
            }
        }
        return result;

    }
}
