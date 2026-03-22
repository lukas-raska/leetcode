package leetcode.easy.task_1886_determine_whether_matrix_can_be_obtained_by_rotation;

import java.util.Arrays;

public class Solution1886 {



    public boolean findRotation(int[][] mat,
                                int[][] target) {

        if (Arrays.deepEquals(mat, target)) {
            return true;
        }
        int[][] rotated = copy(mat);
        for (int i = 0; i < 3; i++) {
            rotated = rotate(rotated);
            if (Arrays.deepEquals(rotated, target)) {
                return true;
            }
        }
        return false;
    }



    private int[][] rotate(int[][] mat) {
        int[][] rotated = new int[mat.length][mat[0].length];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                rotated[col][row] = mat[row][col];
            }
        }
        int top = 0;
        int bottom = rotated.length - 1;
        while (top < bottom) {
            int[] temp = rotated[top];
            rotated[top] = rotated[bottom];
            rotated[bottom] = temp;
            top++;
            bottom--;
        }
        return rotated;
    }

    private int[][] copy(int[][] mat) {
        int[][] copy = new int[mat.length][];
        for (int i = 0; i < mat.length; i++) {
            copy[i] = Arrays.copyOf(mat[i], mat[i].length);
        }
        return copy;
    }


}
