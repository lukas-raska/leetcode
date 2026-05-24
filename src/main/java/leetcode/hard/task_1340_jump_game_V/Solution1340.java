package leetcode.hard.task_1340_jump_game_V;

import java.util.Arrays;

public class Solution1340 {

    public int maxJumps(int[] arr,
                        int d) {

        int[] cache = new int[arr.length];
        Arrays.fill(cache, -1);
        int maxJumps = 0;
        for (int i = 0; i < arr.length; i++) {
            maxJumps = Math.max(maxJumps, countJumps(i, d, arr, cache));
        }
        return maxJumps;

    }

    private int countJumps(int index,
                           int maxJumpLength,
                           int[] arr,
                           int[] cache) {

        if (cache[index] > -1) {
            return cache[index];
        }

        int jumps = 1;
        int left = Math.max(0, index - maxJumpLength);
        int right = Math.min(index + maxJumpLength, arr.length - 1);

        for (int i = index + 1; i <= right; i++) {
            if (arr[i] < arr[index]) {
                jumps = Math.max(jumps, 1 + countJumps(i, maxJumpLength, arr, cache));
            } else {
                break;
            }
        }

        for (int i = index - 1; i >= left; i--) {
            if (arr[i] < arr[index]) {
                jumps = Math.max(jumps, 1 + countJumps(i, maxJumpLength, arr, cache));
            } else {
                break;
            }
        }

        cache[index] = jumps;
        return jumps;
    }
}
