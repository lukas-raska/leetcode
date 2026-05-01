package leetcode.medium.task_3742_maximum_path_score_in_a_grid;

public class Solution3742 {

    public int maxPathScore(int[][] grid,
                            int k) {

        int rows = grid.length;
        int cols = grid[0].length;

        int[][][] dp = new int[rows][cols][k + 1];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                for (int cost = 0; cost < k + 1; cost++) {
                    dp[r][c][cost] = -1;
                }
            }
        }

        //inicializace první buňky
        int startScore = grid[0][0];
        int startCost = startScore > 0 ? 1 : 0;
        dp[0][0][startCost] = startScore;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row == 0 && col == 0) {
                    continue;
                }
                int cellScore = grid[row][col];
                int cellCost = cellScore > 0 ? 1 : 0;

                //from above
                if (row > 0) {
                    for (int cost = 0; cost <= k; cost++) {
                        int scoreAbove = dp[row - 1][col][cost];
                        if (scoreAbove != -1) {
                            int adjustedCellScore = cellScore + scoreAbove;
                            int adjustedCellCost = cellCost + cost;
                            if (adjustedCellCost <= k) {
                                dp[row][col][adjustedCellCost] = adjustedCellScore;
                            }
                        }
                    }
                }

                //from left
                if (col > 0){
                    for (int cost = 0; cost <= k ; cost++) {
                        int scoreLeft = dp[row][col-1][cost];
                        if (scoreLeft != -1){
                            int adjustedCellScore = cellScore + scoreLeft;
                            int adjustedCellCost = cellCost + cost;
                            if (adjustedCellCost <= k){
                                dp [row][col][adjustedCellCost] = Math.max(dp [row][col][adjustedCellCost],
                                        adjustedCellScore);
                            }
                        }
                    }
                }
            }
        }

        int maxScore = -1;

        for (int cost = 0; cost <= k; cost++) {
            maxScore = Math.max(maxScore, dp[rows - 1][cols - 1][cost]);
        }

        return maxScore;
    }


}
