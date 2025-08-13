package leetcode.easy.task_0326_power_of_three;

public class Solution0326 {

    public boolean isPowerOfThree(int n){
        if (n < 1) {
            return false;
        }
        long power = 1;
        while (power <= n){
            if (power == n){
                return true;
            }
            power*=3;
        }
        return false;
    }
}
