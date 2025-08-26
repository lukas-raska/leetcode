package leetcode.easy.task_3000_maximum_area_on_longest_diagonal_rectangle;

public class Solution3000 {

    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonalSquaredFound = 0;
        int indexOfMax = 0;
        for (int i = 0; i < dimensions.length; i++) {
            int length = dimensions[i][0];
            int width = dimensions[i][1];
            int squaredDiagonal = length * length + width * width;
            if (squaredDiagonal > maxDiagonalSquaredFound) {
                maxDiagonalSquaredFound = squaredDiagonal;
                indexOfMax = i;
            } else if (squaredDiagonal == maxDiagonalSquaredFound) {
                int currentArea = getArea(i, dimensions);
                int maxArea = getArea(indexOfMax, dimensions);
                if (currentArea > maxArea) {
                    indexOfMax = i;
                }
            }
        }
        return getArea(indexOfMax, dimensions);
    }

    private int getArea(int index,
                        int[][] dimensions) {
        return dimensions[index][0] * dimensions[index][1];
    }
}
