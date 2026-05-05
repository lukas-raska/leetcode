package leetcode.quests.dataStructuresAndAlgorithms.stack.Q3_exclusiveTimeOfFunctions;

import java.util.List;

public class SolutionQ3 {

    public int[] exclusiveTime(int n,
                               List<String> logs) {

        int[] time = new int[n];
        int now = 0;
        int[] stack = new int[n];
        int top = -1;
        for (String log : logs) {
            String[] split = log.split(":");
            int id = Integer.parseInt(split[0]);
            String cmd = split[1];
            int timestamp = Integer.parseInt(split[2]);
            if (cmd.equals("start")) {
                if (top != -1) {
                    int lastId = stack[top];
                    time[lastId] += timestamp;
                    now = timestamp;
                }
                stack[++top] = id;
            } else {
                top--;
                time[id] += timestamp - now + 1;
                now = timestamp;
            }
        }
        return time;
    }

}
