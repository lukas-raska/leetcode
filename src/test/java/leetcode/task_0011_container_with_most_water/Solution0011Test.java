package leetcode.task_0011_container_with_most_water;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0011Test {

     Solution0011 solution0011 = new Solution0011();

    @Test
    void example1() {
        assertEquals(49, solution0011.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    @Test
    void example2() {
        assertEquals(1, solution0011.maxArea(new int[] {1,1}));
    }

    @Test
    void example3() {
        assertEquals(2, solution0011.maxArea(new int[] {1,2,1}));
    }


}