package leetcode.easy.task_2582_pass_the_pillow;

public class Solution2582 {

    public int passThePillow(int n,
                             int time) {
        boolean countFromStart = time / (n - 1) % 2 == 0;
        int rest = time % (n - 1);
        return (countFromStart) ? 1 + rest : n - rest;
    }
}
