package leetcode.medium.task_0498_diagonal_traverse;

public class Solution0498 {

    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] res = new int[rows * cols];
        int r = 0;
        int c = 0;
        int dr = -1;
        int dc = 1;
        for (int i = 0; i < res.length; i++) {
            res[i] = mat[r][c];
            r += dr;
            c += dc;
            if (r < 0 && c >= cols) {
                r = 1;
                c = cols-1;
                dr *= -1;
                dc *= -1;
            }
            if (r == rows && c < 0) {
                r = rows - 1;
                c = 1;
                dr *= -1;
                dc *= -1;
            }
            if (r < 0) {
                r = 0;
                dr *= -1;
                dc *= -1;
            }
            if (r >= rows) {
                r = rows - 1;
                dr *= -1;
                dc *= -1;
                c+= (2*dc);
            }
            if (c < 0) {
                c = 0;
                dr *= -1;
                dc *= -1;
            }
            if (c >= cols) {
                c = cols - 1;
                dr *= -1;
                dc *= -1;
                r += (2*dr);
            }

        }
        return res;
    }
}

