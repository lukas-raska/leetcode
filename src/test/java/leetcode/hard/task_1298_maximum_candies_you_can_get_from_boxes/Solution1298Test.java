package leetcode.hard.task_1298_maximum_candies_you_can_get_from_boxes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1298Test {

    Solution1298 solution1298 = new Solution1298();

    @Test
    public void example1(){
        int [] status = {1,0,1,0};
        int [] candies = {7,5,4,100};
        int [][] keys = {{},{},{1},{}};
        int [][] containedBoxes = {{1,2},{3},{},{}};
        int [] initialBoxes = {0};
        assertEquals(16,solution1298.maxCandies(status,candies,keys,containedBoxes,initialBoxes));
    }

    @Test
    public void example2(){
        int [] status = {1,0,0,0,0,0};
        int [] candies = {1,1,1,1,1,1};
        int [][] keys = {{1,2,3,4,5},{},{},{},{},{}};
        int [][] containedBoxes = {{1,2,3,4,5},{},{},{},{},{}};
        int [] initialBoxes = {0};
        assertEquals(6,solution1298.maxCandies(status,candies,keys,containedBoxes,initialBoxes));
    }

}