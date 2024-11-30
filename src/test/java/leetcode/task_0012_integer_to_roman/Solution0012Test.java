package leetcode.task_0012_integer_to_roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0012Test {

    Solution0012 solution0012 = new Solution0012();

    public void testMethod(String expected,
                           int input) {
        String result = solution0012.intToRoman(input);
        String message = "Expected :" + expected + ", Result: " + result;
        assertEquals(expected, result, message);
    }

    @Test
    void example1() {
        testMethod("MMMDCCXLIX", 3749);
    }

    @Test
    void example2() {
        testMethod("LVIII", 58);
    }

    @Test
    void example3() {
        testMethod("MCMXCIV", 1994);
    }

    @Test
    void example4() {
        testMethod("DIII", 503);
    }
}