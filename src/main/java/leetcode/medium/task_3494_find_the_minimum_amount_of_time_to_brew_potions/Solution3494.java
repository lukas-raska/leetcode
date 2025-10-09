package leetcode.medium.task_3494_find_the_minimum_amount_of_time_to_brew_potions;

import java.util.Arrays;

public class Solution3494 {

    public long minTime(int[] skill,
                        int[] mana) {

        long[] prev = new long[skill.length + 1];
        long[] curr = new long[skill.length + 1];

        //first line
        prev[0] = 0;
        for (int i = 0; i < skill.length; i++) {
            prev[i + 1] = prev[i] + ((long) mana[0] * skill[i]);
        }

        for (int i = 1; i < mana.length; i++) {
            curr[0] = 0;
            for (int j = 0; j < skill.length; j++) {
                curr[j + 1] = curr[j] + ((long) mana[i] * skill[j]);
            }

            long timeToWait = 0;
            for (int j = 0; j < skill.length; j++) {
                timeToWait = Math.max(timeToWait, prev[j + 1] - curr[j]);
            }
            long toWait = timeToWait;
            Arrays.setAll(prev, k -> prev[k] = curr[k] + toWait);
        }

        return prev[skill.length];
    }
}
