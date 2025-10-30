package leetcode.easy.task_3370_smallest_number_with_all_set_bits;

public class Solution3370 {

    public int smallestNumber(int n) {
        return Integer.parseInt(
                Integer.toBinaryString(n).replaceAll("0", "1"),
                2);

    }
}
