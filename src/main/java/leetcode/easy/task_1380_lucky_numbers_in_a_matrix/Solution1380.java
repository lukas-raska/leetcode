package leetcode.easy.task_1380_lucky_numbers_in_a_matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution1380 {

    public List<Integer> luckyNumbers(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] rowMinimums = new int[rows];
        int[] colMaximums = new int[cols];

        for (int row = 0; row < rows; row++) {
            int currentRowMin = Integer.MAX_VALUE;
            for (int col = 0; col < cols; col++) {
                int currentValue = matrix[row][col];
                currentRowMin = Math.min(currentRowMin, currentValue);
                colMaximums[col] = Math.max(colMaximums[col], currentValue);
            }
            rowMinimums[row] = currentRowMin;
        }

        List<Integer> result = new ArrayList<>();

        for(int min : rowMinimums){
            for (int max:colMaximums){
                if (min == max){
                    result.add(min);
                }
            }
        }

        return result;
    }
}
