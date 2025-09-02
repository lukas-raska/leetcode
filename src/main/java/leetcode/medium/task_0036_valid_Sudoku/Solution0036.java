package leetcode.medium.task_0036_valid_Sudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution0036 {

    public boolean isValidSudoku(char[][] board) {
        final int size = board.length;
        final List<Set<Character>> columnValues = new ArrayList<>(size);
        final List<Set<Character>> squareValues = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            columnValues.add(new HashSet<>(size));
            squareValues.add(new HashSet<>(size));
        }
        for (int r = 0; r < size; r++) {
            Set<Character> currentRow = new HashSet<>(size);
            boolean added = false;
            for (int c = 0; c < size; c++) {
                int squareIndex = getSquareIndex(r, c);
                char current = board[r][c];
                if (current == ('.')){
                    continue;
                }
                added = currentRow.add(current) && columnValues.get(c).add(current) && squareValues.get(squareIndex)
                        .add(current);
                if (!added) {
                    return false;
                }

            }
        }
        return true;
    }


    private int getSquareIndex(int row,
                               int col) {
        if (row >= 0 && row < 3) {
            return switch (col) {
                case 0, 1, 2 -> 0;
                case 3, 4, 5 -> 1;
                case 6, 7, 8 -> 2;
                default -> -1;
            };
        } else if (row >= 3 && row < 6) {
            return switch (col) {
                case 0, 1, 2 -> 3;
                case 3, 4, 5 -> 4;
                case 6, 7, 8 -> 5;
                default -> -1;
            };
        } else {
            return switch (col) {
                case 0, 1, 2 -> 6;
                case 3, 4, 5 -> 7;
                case 6, 7, 8 -> 8;
                default -> -1;
            };
        }
    }

}



