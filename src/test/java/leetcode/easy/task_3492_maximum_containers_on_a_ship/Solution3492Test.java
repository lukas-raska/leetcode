package leetcode.easy.task_3492_maximum_containers_on_a_ship;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3492Test {

    Solution3492 solution3492 = new Solution3492();

    @Test
    public void testCase1(){
        assertEquals(4, solution3492.maxContainers(2,3,15));
    }

    @Test
    public void testCase2(){
        assertEquals(4, solution3492.maxContainers(3,5,20));
    }


}