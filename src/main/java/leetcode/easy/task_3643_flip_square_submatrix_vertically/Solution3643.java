package leetcode.easy.task_3643_flip_square_submatrix_vertically;

import java.util.Arrays;

public class Solution3643 {

    public int[][] reverseSubmatrix(int[][] grid,
                                    int x,
                                    int y,
                                    int k) {


        int upper = x;
        int lower = x + k - 1;

        while (upper < lower) {
            for (int col = y; col < y + k; col++) {
                int temp = grid[upper][col];
                grid[upper][col] = grid[lower][col];
                grid[lower][col] = temp;
            }
            upper++;
            lower--;
        }

        return grid;

    }
}
