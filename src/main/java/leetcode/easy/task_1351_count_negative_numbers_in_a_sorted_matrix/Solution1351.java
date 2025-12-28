package leetcode.easy.task_1351_count_negative_numbers_in_a_sorted_matrix;

public class Solution1351 {

    public int countNegatives(int[][] grid) {
        int negatives = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] < 0) {
                    negatives++;
                }
            }
        }
        return negatives;
    }
}
