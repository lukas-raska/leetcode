package leetcode.medium.task_0048_rotate_image;

public class Solution48 {

    public void rotate(int[][] matrix) {

        int n = matrix.length;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (c < (n - 1 - r)) {
                    int temp = matrix[r][c];
                    matrix[r][c] = matrix[n - 1 - c][n - 1 - r];
                    matrix[n - 1 - c][n - 1 - r] = temp;
                }
            }
        }

        for (int r = 0; r < n / 2; r++) {
            int[] temp = matrix[r];
            matrix[r] = matrix[n - 1 - r];
            matrix[n - 1 - r] = temp;
        }
    }
}
