package leetcode.task_976;

import leetcode.task_976.largest_perimeter_triangle.Main0976;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main0976Test {

    @Test
    public void largestPerimeterTest() {
        assertEquals(5, Main0976.largestPerimeter(new int[]{2,1,2}));
        assertEquals(0, Main0976.largestPerimeter(new int[]{1,2,1,10}));
        assertEquals(10, Main0976.largestPerimeter(new int[]{3,2,3,4}));
    }

}