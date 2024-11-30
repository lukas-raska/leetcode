package leetcode.task_0013_roman_to_integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0013Test {

    private final Solution0013 solution0013 = new Solution0013();

    public void testMethod(String givenInput, int expectedOutput){
        int output = solution0013.romanToInt(givenInput);
        String message = "For given input (%s) -> Expected: %d -- reality: %d".formatted(givenInput, expectedOutput,
                output);
        assertEquals(expectedOutput,output,message);
    }

    @Test
    void example1() {
        testMethod("III",3);
    }

    @Test
    void example2() {
        testMethod("LVIII",58);
    }

    @Test
    void example3() {
        testMethod("MCMXCIV",1994);
    }
}