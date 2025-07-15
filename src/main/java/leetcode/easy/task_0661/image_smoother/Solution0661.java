package leetcode.easy.task_0661.image_smoother;

public class Solution0661 {

    public int[][] imageSmoother(int[][] img) {
        int rows = img.length;
        int cols = img[0].length;
        int[][] smoothed = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                smoothed[r][c] = smoothe(r, c, img);
            }
        }
        return smoothed;
    }

    private int smoothe(int row,
                        int col,
                        int[][] img) {
        int fromRow = Math.max(0, row - 1);
        int toRow = Math.min(img.length - 1, row + 1);
        int fromCol = Math.max(0, col - 1);
        int toCol = Math.min(img[row].length - 1, col + 1);
        int count = 0;
        int sum = 0;
        for (int r = fromRow; r <= toRow; r++) {
            for (int c = fromCol; c <= toCol; c++) {
                sum += img[r][c];
                count++;
            }
        }
        double avg = (double) sum / count;

        return (int) Math.floor(avg);
    }
}
