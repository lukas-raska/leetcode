package leetcode.task_0001_two_sum.two_sum;

import leetcode.task_0001_two_sum.Solution0001;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0001Test {

    private Solution0001 solution0001 = new Solution0001();

    @Test
    void twoSumTest() {
        assertArrayEquals(new int[] {0,1}, solution0001.twoSum(new int[]{2,7,11,15}, 9));
        assertArrayEquals(new int[] {1,2}, solution0001.twoSum(new int[]{3,2,4}, 6));
        assertArrayEquals(new int[] {0,1}, solution0001.twoSum(new int[]{3,3}, 6));
    }
}