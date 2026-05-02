package leetcode.medium.task_0788_rotated_digits;

public class Solution788 {

    private static final int[] ROTATED = {0, 1, 5, -1, -1, 2, 9, -1, 8, 6};

    public int rotatedDigits(int n) {

        int found = 0;
        for (int i = 1; i <= n; i++) {
            int rotated = getRotated(i);
            if (rotated != -1 && rotated != i) {
                found++;
            }
        }

        return found;
    }

    private int getRotated(int n) {
        int result = 0;
        int exp = 1;
        while (n > 0) {
            int digit = n % 10;
            int rotated = ROTATED[digit];
            if (rotated == -1) {
                return -1;
            }
            result += (exp * rotated);
            n /= 10;
            exp *= 10;
        }
        return result;
    }


}
