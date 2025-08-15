package leetcode.easy.tas_0342_power_of_four;

public class Solution0342 {

    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        long pow = 1;
        while (pow <= n) {
            if (pow == n) {
                return true;
            }
            pow *= 4;
        }
        return false;
    }
}
