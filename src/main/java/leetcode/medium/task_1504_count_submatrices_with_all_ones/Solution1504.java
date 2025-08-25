package leetcode.medium.task_1504_count_submatrices_with_all_ones;

public class Solution1504 {

    public int numSubMat(int[][] mat) {

        int totalSubmatrices = 0;
        int rowsCnt = mat.length;
        int colsCnt = mat[0].length;

        for (int row = 0; row < rowsCnt; row++) {

            for (int col = 0; col < colsCnt; col++) {

                if (mat[row][col] == 1) {

                    int currentSubmatriceCol = col;
                    int maxRowBoundary = rowsCnt - 1;
                    while (currentSubmatriceCol < colsCnt) {

                        if (mat[row][currentSubmatriceCol] == 1) {
                            totalSubmatrices++;
                        } else {
                            break;
                        }
                        int currentSubmatriceRow = row + 1;

                        if (currentSubmatriceCol == col) {
                            while (currentSubmatriceRow < rowsCnt) {
                                if (mat[currentSubmatriceRow][currentSubmatriceCol] == 1) {
                                    totalSubmatrices++;
                                    currentSubmatriceRow++;
                                } else {
                                    maxRowBoundary = currentSubmatriceRow - 1;
                                    break;
                                }
                            }
                        } else {
                            while (currentSubmatriceRow <= maxRowBoundary) {
                                if (mat[currentSubmatriceRow][currentSubmatriceCol] == 1) {
                                    totalSubmatrices++;
                                    currentSubmatriceRow++;
                                } else {
                                    maxRowBoundary = currentSubmatriceRow - 1;
                                    break;
                                }
                            }
                        }
                        currentSubmatriceCol++;
                    }
                }
            }
        }
        return totalSubmatrices;
    }

}
