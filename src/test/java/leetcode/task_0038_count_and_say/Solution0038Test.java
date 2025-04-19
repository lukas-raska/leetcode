package leetcode.task_0038_count_and_say;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0038Test {

    Solution0038 solution0038 = new Solution0038();

    @Test
    void example1() {
        assertEquals("1", solution0038.countAndSay(1));
    }

    @Test
    void example2() {
        assertEquals("11", solution0038.countAndSay(2));
    }

    @Test
    void example3() {
        assertEquals("21", solution0038.countAndSay(3));
    }

    @Test
    void example4() {
        assertEquals("1211", solution0038.countAndSay(4));
    }

}