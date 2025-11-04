package leetcode.medium.task_3001_minimum_moves_to_capture_the_queen;

public class Solution3001 {

    public int minMovesToCaptureTheQueen(int a,
                                         int b,
                                         int c,
                                         int d,
                                         int e,
                                         int f) {
        // (a,b) white rook position (row,col)
        // (c,d) white bishop position
        // (e,f) black queen position

        //check if rook can hit the queen in one move

        if (a == e) {  //rook and queen shares row
            if (a == c) { //shares the row with bishop too
                if ((b < d && d < f) || f < d && d < b) { // bishop is between rook and queen
                    return 2;
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        }

        if (b == f) { // rook and queen shares column
            if (b == d) { // bishop is in the same column too
                if ((a < c && c < e) || (e < c && c < a)) { // bishop is between rook and queen
                    return 2;
                } else {
                    return 1;
                }
            } else {
                return 1;
            }

        }

        //check if bishop can hit the queen on diagonal
        //left-up
        for (int col = d - 1, row = c - 1; col > 0 && row > 0; col--, row--) {
            if (col == b && row == a) {
                break;
            }
            if (col == f && row == e) {
                return 1;
            }
        }
        //left down
        for (int col = d - 1, row = c + 1; col > 0 && row <= 8; col--, row++) {
            if (col == b && row == a) {
                break;
            }
            if (col == f && row == e) {
                return 1;
            }
        }
        //right down
        for (int col = d + 1, row = c + 1; col <=8 && row <= 8; col++, row++) {
            if (col == b && row == a) {
                break;
            }
            if (col == f && row == e) {
                return 1;
            }
        }
        //right up
        for (int col = d + 1, row = c - 1; col <=8 && row >0; col++, row--) {
            if (col == b && row == a) {
                break;
            }
            if (col == f && row == e) {
                return 1;
            }
        }

        return 2;
    }


}

