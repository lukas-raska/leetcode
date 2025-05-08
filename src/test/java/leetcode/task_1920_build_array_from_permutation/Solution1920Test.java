package leetcode.task_1920_build_array_from_permutation;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution1920Test {

    private Solution1920 solution1920 = new Solution1920();

    @Test
    public void testCase1(){
        int [] input = {0,2,1,5,3,4};
        int [] output = {0,1,2,4,5,3};
        assertArrayEquals(output, solution1920.buildArray(input));
    }

    @Test
    public void testCase2(){
        int [] input = {5,0,1,2,3,4};
        int [] output = {4,5,0,1,2,3};
        assertArrayEquals(output, solution1920.buildArray(input));
    }

}