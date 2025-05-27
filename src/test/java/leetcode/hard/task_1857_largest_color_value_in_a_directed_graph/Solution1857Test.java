package leetcode.hard.task_1857_largest_color_value_in_a_directed_graph;

import leetcode.easy.task_2894_divisible_and_non_divisible_sums_difference.Solution2894;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1857Test {

    Solution2894 solution1857 = new Solution1857();

    @Test
    public void example1(){
        String colors = "abaca";
        int[][]edges = {{0,1},{0,2},{2,3},{3,4}};
        int expected = 3;
        assertEquals(expected,solution1857.largestPathValue(colors,edges));
    }

    @Test
    public void example2(){
        String colors = "a";
        int[][]edges = {{0,0}};
        int expected = -1;
        assertEquals(expected,solution1857.largestPathValue(colors,edges));
    }

    @Test
    public void example3(){
        String colors = "hhqhuqhqff";
        int[][]edges = {{0,1},{0,2},{2,3},{3,4},{3,5},{5,6},{2,7},{6,7},{7,8},{3,8},{5,8},{8,9},{3,9},{6,9}};
        int expected = 3;
        assertEquals(expected,solution1857.largestPathValue(colors,edges));
    }

}