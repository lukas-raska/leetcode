package leetcode.easy.task_3120_count_the_number_of_special_characters_I;

public class Solution3120 {

    public int numberOfSpecialChars(String word) {

        int alphabetLength = 'Z'-'A'+1;
        int result = 0;
        int [] lowercases = new int[alphabetLength];
        int [] uppercases = new int[alphabetLength];

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            if (current >= 'a' && current <= 'z'){
                lowercases[current - 'a']++;
            }
            if (current >= 'A' && current <= 'Z'){
                uppercases[current - 'A']++;
            }
        }
        for (int i = 0; i < alphabetLength; i++) {
            if (lowercases[i]>0 && uppercases[i]>0){
                result++;
            }
        }
        return result;

    }
}
