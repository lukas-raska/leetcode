package leetcode.medium.task_1861_rotating_the_box;

import java.util.Arrays;

public class Solution1861 {

    private final static char STONE = '#';
    private final static char OBSTACLE = '*';
    private final static char EMPTY = '.';

    public char[][] rotateTheBox(char[][] boxGrid) {

        int rows = boxGrid.length;
        int cols = boxGrid[0].length;

        for (char[] row : boxGrid) {
            int lastEmpty = cols - 1;
            for (int c = cols - 1; c >= 0; c--) {
                if (row[c] == STONE) {
                    row[c] = EMPTY;
                    row[lastEmpty--] = STONE;
                }
                if (row[c] == OBSTACLE) {
                    lastEmpty = c - 1;
                }
            }
        }

        char[][] rotated = new char[cols][rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                rotated[c][rows - 1 - r] = boxGrid[r][c];
            }
        }

        return rotated;
    }

}
