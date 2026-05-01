package leetcode.medium.task_0396_rotate_function;

public class Solution396 {
    //f(i + 1) == f(i) + sumaVsech - n * nums[i]
    public int maxRotateFunction(int[] nums) {

        int length = nums.length;
        int sumOfAll = 0;
        int rotatedSum = 0;

        for (int i = 0; i < length; i++) {
            sumOfAll += nums[i];
            rotatedSum += i * nums[i];
        }

        int max = rotatedSum;

        for (int offset = 1; offset < length; offset++) {
            rotatedSum +=  sumOfAll - length * nums[length -offset];
            max = Math.max(max, rotatedSum);
        }
        return max;

    }


}
