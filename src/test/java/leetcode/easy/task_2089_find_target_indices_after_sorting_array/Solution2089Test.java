package leetcode.easy.task_2089_find_target_indices_after_sorting_array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution2089Test {

    Solution2089 solution = new Solution2089();

    @Test
    public void example1(){
        int[] nums = new int[]{1,2,5,2,3};
        int target = 2;
        var expected = List.of(1,2);
        assertEquals(expected, solution.targetIndices(nums,target));
    }

    @Test
    public void example2(){
        int[] nums = new int[]{1,2,5,2,3};
        int target = 3;
        var expected = List.of(3);
        assertEquals(expected, solution.targetIndices(nums,target));
    }

    @Test
    public void example3(){
        int[] nums = new int[]{1,2,5,2,3};
        int target = 5;
        var expected = List.of(4);
        assertEquals(expected, solution.targetIndices(nums,target));
    }



}