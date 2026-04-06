package leetcode.easy.task_2833_furthest_point_from_origin;

public class Solution2833 {

    public int furthestDistanceFromOrigin(String moves) {

        int R = 0, L = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'L') {
                L++;
            }
            if (c == 'R') {
                R++;
            }
        }

        return moves.length() - 2 * (Math.min(L, R));
    }
}
