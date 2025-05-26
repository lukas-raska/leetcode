package leetcode.medium.task_2131_longest_palindrome_by_concatenating_two_letter_words;

import java.util.*;

public class Solution2131 {

    public int longestPalindrome(String[] words) {

        Map<String, Integer> sameLetters = new HashMap<>();
        Map<String, Integer> differentLetters = new HashMap<>();
        int longestPalindromeLength = 0;

        for (String word : words) {
            if (word.charAt(0) == word.charAt(1)) {
                sameLetters.merge(word, 1, Integer::sum);
            } else {
                differentLetters.merge(word, 1, Integer::sum);
            }
        }

        if (!sameLetters.isEmpty()) {
            var sameLettersArray = sameLetters.keySet().toArray(String[]::new);
            boolean oddInTheMiddleUsed = false;
            for (String currentWord : sameLettersArray) {
                int currentFrequency = sameLetters.get(currentWord);
                if (currentFrequency % 2 == 0) {
                    longestPalindromeLength += currentFrequency * 2;
                } else {
                    if (!oddInTheMiddleUsed) {
                        longestPalindromeLength += currentFrequency * 2;
                        oddInTheMiddleUsed = true;
                    } else {
                        longestPalindromeLength += currentFrequency * 2 - 2;
                    }
                }
            }
        }

        if (!differentLetters.isEmpty()) {
            Set<String> usedWords = new HashSet<>();
            var diffLettersArray = differentLetters.keySet().toArray(String[]::new);
            for (String current : diffLettersArray) {
                if (!usedWords.contains(current)) {
                    usedWords.add(current);
                    String mirrorWord = "" + current.charAt(1) + current.charAt(0);
                    if (differentLetters.containsKey(mirrorWord)) {
                        usedWords.add(mirrorWord);
                        int currentFrqncy = differentLetters.get(current);
                        int mirrorFrqncy = differentLetters.get(mirrorWord);
                        longestPalindromeLength += (Math.min(currentFrqncy, mirrorFrqncy)*4);
                    }
                }
            }
        }
        return longestPalindromeLength;
    }
}
