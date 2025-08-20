package leetcode.hard.task_0980_unique_paths_III;

public class Solution0980 {

    enum Direction {
        N(-1, 0),
        E(0, 1),
        S(1, 0),
        W(0, -1);

        private final int dRow;
        private final int dCol;

        Direction(int dRow,
                  int dCol) {
            this.dRow = dRow;
            this.dCol = dCol;
        }
    }


    public int uniquePathsIII(int[][] grid) {
        int[] startingSquare = new int[2];
        int maxPath = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    startingSquare = new int[]{r, c};
                }
                if (grid[r][c] == 0 || grid[r][c] == 2) {
                    maxPath++;
                }
            }
        }
        return traverse(grid, startingSquare, 0, maxPath);
    }

    public int traverse(int[][] grid,
                        int[] currentSquare,
                        int currentPathLength,
                        int maxPathLength) {
        if (grid[currentSquare[0]][currentSquare[1]] == -3){
            return currentPathLength == maxPathLength? 1: 0;
        }
        int pathsFound = 0;
        for (Direction dir : Direction.values()) {
            int nextRow = currentSquare[0] + dir.dRow;
            int nextCol = currentSquare[1] + dir.dCol;
            if (isPossible(grid, nextRow, nextCol)) {
                grid[nextRow][nextCol]-=5;
                pathsFound += traverse(grid, new int[]{nextRow, nextCol},
                        currentPathLength + 1, maxPathLength);
                grid[nextRow][nextCol]+=5;
            }
        }
        return pathsFound;
    }

    private boolean isPossible(int[][] grid,
                               int nextRow,
                               int nextCol) {
        return isInTheGrid(grid, nextRow, nextCol) && (grid[nextRow][nextCol] == 0 || grid[nextRow][nextCol] == 2);
    }

    private boolean isInTheGrid(int[][] grid,
                                int nextRow,
                                int nextCol) {
        int maxRow = grid.length - 1;
        int maxCol = grid[0].length - 1;
        return nextRow >= 0 && nextRow <= maxRow && nextCol >= 0 && nextCol <= maxCol;
    }


}
