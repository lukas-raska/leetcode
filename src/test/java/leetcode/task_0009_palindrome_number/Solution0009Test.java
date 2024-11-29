package leetcode.task_0009_palindrome_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0009Test {

    private final Solution0009 solution0009 = new Solution0009();

    @Test
    void example1() {
        assertTrue(solution0009.isPalindrome(121));
    }

    @Test
    void example2() {
        assertFalse(solution0009.isPalindrome(-121));
    }

    @Test
    void example3() {
        assertFalse(solution0009.isPalindrome(10));
    }
}