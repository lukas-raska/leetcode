package leetcode.medium.task_1871_jump_game_IV;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1871 {

    public boolean canReach(String s,
                            int minJump,
                            int maxJump) {

        int n = s.length();
        if (s.charAt(n - 1) == '1') {
            return false;
        }

        boolean[] reachable = new boolean[n];
        reachable[0] = true;
        int farthestChecked = 0;
        int farthestReachable = 0;

        for (int i = 0; i < n; i++) {

            if (!reachable[i]) {
                continue;
            }

            if (i > farthestReachable) {
                break;
            }

            int start = Math.max(i + minJump, farthestChecked + 1);
            int end = Math.min(i + maxJump, n - 1);

            for (int j = start; j <= end; j++) {
                if (s.charAt(j) == '0' && !reachable[j]) {
                    reachable[j] = true;
                    farthestReachable = Math.max(farthestReachable, j);
                }
            }
            farthestChecked = Math.max(farthestChecked, end);
        }

        return reachable[n - 1];
    }
}
