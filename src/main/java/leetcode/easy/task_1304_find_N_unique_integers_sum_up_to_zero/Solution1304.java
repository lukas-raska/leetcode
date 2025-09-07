package leetcode.easy.task_1304_find_N_unique_integers_sum_up_to_zero;

public class Solution1304 {

    public int [] sumZero(int n){
        int[] result = new int[n];
        if (n == 1){
            return new int[]{0};
        }
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            result[i] = i+1;
            sum+=result[i];
        }
        result[n-1] = -sum;

        return result;
    }
}
