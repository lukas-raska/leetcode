package leetcode.task_2109_addinng_spaces_to_a_string;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution2109Test {

    private final Solution2109 solution2109 = new Solution2109();

    @Test
    void example1() {
        assertEquals("Leetcode Helps Me Learn", solution2109.addSpaces("LeetcodeHelpsMeLearn", new int[]{8,13,15}));
    }
    @Test
    void example2() {
        assertEquals("i code in py thon", solution2109.addSpaces("icodeinpython", new int[]{1,5,7,9}));
    }

    @Test
    void example3() {
        assertEquals(" s p a c i n g", solution2109.addSpaces("spacing", new int[]{0,1,2,3,4,5,6}));
    }

    @Test
    void example4() {
        assertEquals(" s p a c i n g", solution2109.addSpaces("spacing", new int[]{0,1,2,3,4,5,6}));
    }


}