package leetcode.task_0016_3sum_closest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0016Test {

    Solution0016 solution0016 = new Solution0016();

    @Test
    void example1() {
        assertEquals(2, solution0016.threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }

    @Test
    void example2() {
        assertEquals(3, solution0016.threeSumClosest(new int[]{0,1,2}, 3));
    }

}