package leetcode.task_1128_number_of_equivalent_domino_pairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1128Test {

    private Solution1128 solution1128 = new Solution1128();

    @Test
    public void testCase1() {
        int expected = 1;
        int actual = solution1128.numEquivDominoPairs(new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}});
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int expected = 3;
        int actual = solution1128.numEquivDominoPairs(new int[][]{{1,2},{1,2},{1,1},{1,2},{2,2}});
        assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        int expected = 15;
        int actual = solution1128.numEquivDominoPairs(new int[][]{{2,1},{1,2},{1,2},{1,2},{2,1},{1,1},{1,2},{2,2}});
        assertEquals(expected, actual);
    }

    @Test
    public void getPairCountTest(){
        int [] expectedResults = {0,0,1,3,6,10,15,21,28};
        for (int i = 0; i < expectedResults.length; i++) {
            int actual = solution1128.getPairCount(i);
            boolean test = actual == expectedResults[i];
            String msg = "Elements = %d, Expected = %d, Actual = %d, Test = %b".formatted( i, expectedResults[i],
                    actual,test);
            assertEquals(expectedResults[i], actual, msg);


        }

    }

}