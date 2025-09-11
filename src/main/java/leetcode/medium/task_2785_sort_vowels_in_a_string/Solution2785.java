package leetcode.medium.task_2785_sort_vowels_in_a_string;

import java.util.List;

public class Solution2785 {

    public String sortVowels(String s) {
        int size = s.length();
        char[] sorted = new char[size];
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        int[] vowelsFrq = new int[vowels.length];
        for (int i = 0; i < size; i++) {
            char curr = s.charAt(i);
            int vowelIdx = switch (curr) {
                case 'A' -> 0;
                case 'E' -> 1;
                case 'I' -> 2;
                case 'O' -> 3;
                case 'U' -> 4;
                case 'a' -> 5;
                case 'e' -> 6;
                case 'i' -> 7;
                case 'o' -> 8;
                case 'u' -> 9;
                default -> -1;
            };
            if (vowelIdx >= 0) {
                vowelsFrq[vowelIdx]++;
            } else {
                sorted[i] = curr;
            }
        }
        int currentVowelIdx = 0;
        int used = 0;

        for (int i = 0; i < size; i++) {
            if (sorted[i] == '\u0000') {
                while (vowelsFrq[currentVowelIdx] == 0 || used >= vowelsFrq[currentVowelIdx]) {
                    currentVowelIdx++;
                    used = 0;
                }
                sorted[i] = vowels[currentVowelIdx];
                used++;
            }
        }
        return String.valueOf(sorted);
    }


}
