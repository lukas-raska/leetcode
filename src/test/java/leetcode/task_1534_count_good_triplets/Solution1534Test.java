package leetcode.task_1534_count_good_triplets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1534Test {

    private final Solution1534 solution1534 = new Solution1534();

    @Test
    void example1 (){
        assertEquals(4, solution1534.countGoodTriplets(new int []{3,0,1,1,9,7},7,2,3));
    }

    @Test
    void example2 (){
        assertEquals(0, solution1534.countGoodTriplets(new int []{1,1,2,2,3},0,0,1));
    }

}