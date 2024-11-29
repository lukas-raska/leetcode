package leetcode.task_0010_regular_expression_matching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0010Test {

    Solution0010 solution0010 = new Solution0010();

    @Test
    void example1() {
        assertFalse(solution0010.isMatch("aa", "a"));
    }

    @Test
    void example2() {
        assertTrue(solution0010.isMatch("aa", "a*"));
    }

    @Test
    void example3() {
        assertTrue(solution0010.isMatch("ab", ".*"));
    }
}