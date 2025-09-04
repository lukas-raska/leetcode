package leetcode.medium.task_2498_frog_jump_II;

public class Solution2498 {

    public int maxJump(int[] stones) {
        int maxJump = 0;
        if (stones.length == 2){
            return Math.abs(stones[1]-stones[0]);
        }
        for (int i = 0; i < stones.length - 2; i++) {
            int jump = Math.abs(stones[i + 2] - stones[i]);
            if (jump > maxJump) {
                maxJump = jump;
            }
        }
        return maxJump;
    }
}
