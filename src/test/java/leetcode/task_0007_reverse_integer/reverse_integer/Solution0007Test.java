package leetcode.task_0007_reverse_integer.reverse_integer;

import leetcode.task_0007_reverse_integer.Solution0007;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0007Test {

    Solution0007 solution0007 = new Solution0007();

    @Test
    void basicReverseTest() {
        assertEquals(321, solution0007.reverse(123));
        assertEquals(-321, solution0007.reverse(-123));
        assertEquals(21, solution0007.reverse(120));
        assertEquals(0, solution0007.reverse(1534236469));
    }

    @Test
    void bigNumTest(){
        assertEquals(0, solution0007.reverse(1534236469));

    }

    @Test
    void minIntegertest(){
        assertEquals(0, solution0007.reverse(Integer.MIN_VALUE));
    }

    @Test
    void maxIntegerTest(){
        assertEquals(0, solution0007.reverse(Integer.MAX_VALUE));
    }
}