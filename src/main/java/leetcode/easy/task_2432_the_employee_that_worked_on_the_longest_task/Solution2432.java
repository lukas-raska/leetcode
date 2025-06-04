package leetcode.easy.task_2432_the_employee_that_worked_on_the_longest_task;

import java.util.HashMap;
import java.util.Map;

public class Solution2432 {

    public int hardestWorker(int n,
                              int[][] logs) {
        int time = 0;
        int maxDuration = -1;
        int hardestWorker = -1;

        for (var log : logs) {
            int duration = log[1] - time;
            if (duration == maxDuration) {
                hardestWorker = Math.min(hardestWorker, log[0]);
            }
            if (duration > maxDuration) {
                maxDuration = duration;
                hardestWorker = log[0];
            }
            time = log[1];
        }
        return hardestWorker;
    }


}
