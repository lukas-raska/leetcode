package leetcode.medium.task_3403_find_the_lexicographically_largest_string_from_the_box_I;

public class Solution3403 {

    //neprojde testem s dlouhým řetězcem, time limit exceeded
    public String answerString(String word,
                               int numFriends) {

        if (numFriends == 1) {
            return word;
        }

        int minLength = 1;
        int maxLength = word.length() - (numFriends - 1);
        String largest = "";

        for (int i = minLength; i <= maxLength; i++) {
            for (int j = 0; j <= word.length() - i; j++) {
                String current = word.substring(j, j + i);
                if (current.compareTo(largest) > 0) {
                    largest = current;
                }
            }
        }
        return largest;
    }
}
