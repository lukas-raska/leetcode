package leetcode.medium.task_2087_minimum_cost_homecoming_of_a_robot_in_a_grid;

import java.util.Arrays;

public class Solution2087 {

    public int minCost(int[] startPos,
                       int[] homePos,
                       int[] rowCost,
                       int[] colCost) {
        int cost = 0;
        int startingRow = startPos[0];
        int startingCol = startPos[1];
        int finalRow = homePos[0];
        int finalCol = homePos[1];
        int row = startingRow;
        int col = startingCol;
        int rowStep = startingRow <= finalRow ? 1 : -1;
        int colStep = startingCol <= finalCol ? 1 : -1;
        while (row != finalRow) {
            row += rowStep;
            cost += rowCost[row];
        }
        while (col != finalCol) {
            col += colStep;
            cost += colCost[col];
        }
        return cost;
    }
}
