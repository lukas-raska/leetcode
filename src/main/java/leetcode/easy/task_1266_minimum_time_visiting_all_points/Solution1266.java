package leetcode.easy.task_1266_minimum_time_visiting_all_points;

public class Solution1266 {

    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int[] current = points[i];
            int[] next = points[i + 1];
            int dx = Math.abs(next[0] - current[0]);
            int dy = Math.abs(next[1] - current[1]);
            time +=  (Math.min(dx, dy) + Math.abs(dx - dy));
        }
        return time;
    }
}
