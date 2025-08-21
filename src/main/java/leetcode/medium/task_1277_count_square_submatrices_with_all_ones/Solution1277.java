package leetcode.medium.task_1277_count_square_submatrices_with_all_ones;

public class Solution1277 {

    public int countSquares(int[][] matrix) {
        int squares = 0;
        int rowsCnt = matrix.length;
        int colsCnt = matrix[0].length;

        for (int r = 0; r < rowsCnt; r++) {
            for (int c = 0; c < colsCnt; c++) {
                if (matrix[r][c] == 1) {
                    int subMatrixLength = 1;
                    boolean found = true;
                    while (found) {
                        squares++;
                        subMatrixLength++;
                        int lastRow = r + subMatrixLength - 1;
                        int lastCol = c + subMatrixLength - 1;
                        if (lastRow < rowsCnt && lastCol < colsCnt) {
                            for (int i = r; i <= lastRow; i++) {
                                if (matrix[i][lastCol] != 1) {
                                    found = false;
                                    break;
                                }
                            }
                            for (int i = c; i <= lastCol; i++) {
                                if (matrix[lastRow][i] != 1) {
                                    found = false;
                                    break;
                                }
                            }
                        } else { //mimo meze
                            break;
                        }
                    }
                }
            }
        }
        return squares;
    }
}
