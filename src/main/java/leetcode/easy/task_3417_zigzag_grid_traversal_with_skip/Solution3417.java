package leetcode.easy.task_3417_zigzag_grid_traversal_with_skip;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Solution3417 {

    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        boolean skip = false;
        boolean forward = true;
        for (int[] row : grid) {
            int start = forward ? 0 : row.length - 1;
            int end = forward ? row.length : -1;
            int step = forward ? 1 : -1;
            for (int j = start; j != end; j += step) {
                if (!skip) {
                    result.add(row[j]);
                }
                skip = !skip;
            }
            forward = !forward;
        }
        return result;
    }


    public List<Integer> zigzagTraversal3(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        boolean skip = false;
        boolean forward = true;
        for (int[] row : grid) {
            if (forward) {
                for (int k : row) {
                    if (!skip) {
                        result.add(k);
                    }
                    skip = !skip;
                }
            } else {
                for (int j = row.length - 1; j >= 0; j--) {
                    if (!skip) {
                        result.add(row[j]);
                    }
                    skip = !skip;
                }
            }
            forward = !forward;
        }

        return result;
    }

    public List<Integer> zigzagTraversal2(int[][] grid) {

        List<Integer> result = new ArrayList<>();
        boolean isOdd = true;
        for (int i = 0; i < grid.length; i++) {

            int index = i;
            int start = (i % 2 == 0) ? 0 : grid[i].length - 1;
            Predicate<Integer> predicate = (i % 2 == 0) ? n -> n < grid[index].length : n -> n >= 0;
            int di = (i % 2 == 0) ? 1 : -1;

            for (int j = start; predicate.test(j); j = j + di) {
                if (isOdd) {
                    result.add(grid[i][j]);
                }
                isOdd = !isOdd;
            }
        }
        return result;
    }
}
