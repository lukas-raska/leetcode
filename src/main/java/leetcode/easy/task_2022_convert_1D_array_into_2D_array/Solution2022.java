package leetcode.easy.task_2022_convert_1D_array_into_2D_array;

import java.util.Arrays;

public class Solution2022 {

    public int[][] construct2DArray(int[] original,
                                    int m,
                                    int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }
        int[][] constructedArray = new int[m][n];
        int row = 0;
        int col = 0;

        for (int i = 0; i < original.length; i++) {
            constructedArray[row][col++] = original[i];
            if (col == n) {
                row++;
                col = 0;
            }
        }

        return constructedArray;
    }
}

