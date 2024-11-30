package leetcode.task_0014_longest_common_prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0014Test {

    private final Solution0014 solution0014 = new Solution0014();

    @Test
    void longestCommonPrefixExample1() {
        assertEquals("fl", solution0014.longestCommonPrefix(new String [] {"flower", "flow", "flight"}));
    }

    @Test
    void longestCommonPrefixExample2() {
        assertEquals("", solution0014.longestCommonPrefix(new String [] {"dog", "racecar", "car"}));
    }
}