package leetcode.easy.task_2022_convert_1D_array_into_2D_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2022Test {

    Solution2022 solution2022 = new Solution2022();

    @Test
    public void testCase1(){
        int [] original = {1,2,3,4};
        int m = 2, n = 2;
        int[][] expected = new int[][] {{1,2}, {3,4}};
        assertArrayEquals(expected, solution2022.construct2DArray(original,m,n));
    }

}