package leetcode.medium.task_0695_max_area_of_island;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Solution695 {

    enum Direction {
        UP(-1, 0),
        RIGHT(0, 1),
        DOWN(1, 0),
        LEFT(0, -1);

        private final int dRow;
        private final int dCol;

        Direction(int dRow,
                  int dCol) {
            this.dRow = dRow;
            this.dCol = dCol;
        }
    }

    private int getIslandArea(int startRow,
                              int startCol,
                              int[][] grid) {
        int area = 0;

        Deque<int[]> pointsToExplore = new LinkedList<>(List.of(new int[]{startRow, startCol}));
        grid[startRow][startCol]++;

        while (!pointsToExplore.isEmpty()) {
            int[] currentPoint = pointsToExplore.poll();
            area++;
            addNeighboursToQueue(currentPoint, grid, pointsToExplore);
        }
        return area;
    }

    public void addNeighboursToQueue(int[] currentPoint, int [][] grid, Queue<int[]>queue){
        for (Direction direction : Direction.values()) {
            int nextRow = currentPoint[0] + direction.dRow;
            int nextCol = currentPoint[1] + direction.dCol;
            if (nextRow < 0 || nextRow >= grid.length) {
                continue;
            }
            if (nextCol < 0 || nextCol >= grid[nextRow].length) {
                continue;
            }
            if (grid[nextRow][nextCol] == 1) {
                queue.offer(new int[]{nextRow, nextCol});
                grid[nextRow][nextCol]++;
            }
        }
    }

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == 1) {
                    int area = getIslandArea(row, col, grid);
                    maxArea = Math.max(area, maxArea);
                }
            }
        }
        return maxArea;
    }
}
