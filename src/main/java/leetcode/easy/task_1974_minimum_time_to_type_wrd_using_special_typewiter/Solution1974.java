package leetcode.easy.task_1974_minimum_time_to_type_wrd_using_special_typewiter;

public class Solution1974 {


    public int minTimeToType(String word) {

        final int typingTime = 1;
        char previous = 'a';
        int time = 0;
        int alphabetLength = 'z' - 'a' + 1;

        for (char current : word.toCharArray()) {
            int movingTime = 0;
            if (current != previous) {
                if (current > previous) {
                    movingTime = Math.min(current - previous, alphabetLength + previous - current);
                } else {
                    movingTime = Math.min(previous - current, alphabetLength + current - previous);
                }
            }
            time += (movingTime + typingTime);
            previous = current;
        }

        return time;
    }
}
