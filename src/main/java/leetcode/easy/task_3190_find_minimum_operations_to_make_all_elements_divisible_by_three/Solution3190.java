package leetcode.easy.task_3190_find_minimum_operations_to_make_all_elements_divisible_by_three;

public class Solution3190 {

    public int minimumOperations(int[] nums) {
        int ops = 0;
        for (int n : nums) {
            if (n % 3 != 0){
                ops ++;
            }
        }
        return ops;
    }
}
