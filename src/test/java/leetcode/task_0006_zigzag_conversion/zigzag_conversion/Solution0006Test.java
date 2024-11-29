package leetcode.task_0006_zigzag_conversion.zigzag_conversion;

import leetcode.task_0006_zigzag_conversion.Solution0006;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0006Test {

    Solution0006 solution0006 = new Solution0006();

    @Test
    void convertTest() {

        assertEquals("PINALSIGYAHRPI", solution0006.convert("PAYPALISHIRING", 4) );
        assertEquals("PAHNAPLSIIGYIR", solution0006.convert("PAYPALISHIRING", 3) );
        assertEquals("A", solution0006.convert("A", 1) );
    }
}