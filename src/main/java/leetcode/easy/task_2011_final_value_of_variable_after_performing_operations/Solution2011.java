package leetcode.easy.task_2011_final_value_of_variable_after_performing_operations;

public class Solution2011 {

    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for (String op : operations) {
            if (op.contains("+")) {
                value++;
            } else {
                value--;
            }
        }
        return value;
    }
}
