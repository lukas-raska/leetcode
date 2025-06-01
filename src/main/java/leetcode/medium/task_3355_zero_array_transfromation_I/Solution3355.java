package leetcode.medium.task_3355_zero_array_transfromation_I;

public class Solution3355 {

    public boolean isZeroArray2(int[] nums,
                               int[][] queries) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                continue;
            }
            if(nums[i]>queries.length){
                return false;
            }
            int occurenceInQuery = 0;
            for (var query : queries) {
                if (i >= query[0] && i <= query[1]) {
                    occurenceInQuery++;
                }
            }
            if (occurenceInQuery < nums[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isZeroArray(int[] nums, int[][] queries) {
        // process queries
        int[] diff = new int[nums.length + 1];
        for (int[] q: queries) {
            diff[q[0]]++;
            diff[q[1] + 1]--; }
        // find result (for each index in nums we need to have at least that many in sum of diffs, or return false)
        int current = 0;
        for (int idx = 0; idx < nums.length; idx++)
            //current;
            if (nums[idx] > (current += diff[idx])) return false;
        return true;
    }
}
