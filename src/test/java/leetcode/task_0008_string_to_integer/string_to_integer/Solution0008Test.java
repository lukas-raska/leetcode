package leetcode.task_0008_string_to_integer.string_to_integer;

import leetcode.task_0008_string_to_integer.Solution0008;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0008Test {

    private final Solution0008 solution0008 = new Solution0008();

    @Test
    void example1() {
        assertEquals(42, solution0008.myAtoi("42"));
    }

    @Test
    void example2() {
        assertEquals(-42, solution0008.myAtoi("-042"));
    }

    @Test
    void example3() {
        assertEquals(1337, solution0008.myAtoi("1337c0d3"));
    }

    @Test
    void example4() {
        assertEquals(0, solution0008.myAtoi("0-1"));
    }

    @Test
    void example5() {
        assertEquals(0, solution0008.myAtoi("words and 987"));
    }

    @Test
    void example6() {
        assertEquals(Integer.MIN_VALUE, solution0008.myAtoi("-91283472332"));
    }
}