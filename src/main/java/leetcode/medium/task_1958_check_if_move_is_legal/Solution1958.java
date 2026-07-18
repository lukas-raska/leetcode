package leetcode.medium.task_1958_check_if_move_is_legal;

public class Solution1958 {

    public boolean checkMove(char[][] board,
                             int rMove,
                             int cMove,
                             char color) {

        final int[][] directions = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

        if (board[rMove][cMove] != '.') {
            return false;
        }

        for (int[] dir : directions) {
            if (goodLine(dir, rMove, cMove, color, board)) {
                return true;
            }
        }
        return false;
    }


    private boolean goodLine(int[] dir,
                             int rMove,
                             int cMove,
                             char color,
                             char[][] board) {

        char oppositeColor = (color == 'B') ? 'W' : 'B';

        int rNext = rMove + dir[0];
        int cNext = cMove + dir[1];

        if (outOfBoard(rNext,cNext,board) || board[rNext][cNext] != oppositeColor) {
            return false;
        }

        while (board[rNext][cNext] == oppositeColor) {
            rNext += dir[0];
            cNext += dir[1];
            if (outOfBoard(rNext, cNext, board)) {
                return false;
            }
        }

        return board[rNext][cNext] == color;
    }


    private boolean outOfBoard(int r,
                               int c,
                               char[][] board) {
        final int ROW_MIN = 0;
        final int ROW_MAX = board.length - 1;
        final int COL_MIN = 0;
        final int COL_MAX = board[0].length - 1;

        return r < ROW_MIN || r > ROW_MAX || c < COL_MIN || c > COL_MAX;
    }
}
