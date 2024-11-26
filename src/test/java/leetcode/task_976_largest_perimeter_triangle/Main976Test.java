package leetcode.task_976_largest_perimeter_triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main976Test {

    @Test
    public void largestPerimeterTest() {
        assertEquals(5, Main976.largestPerimeter(new int[]{2,1,2}));
        assertEquals(0, Main976.largestPerimeter(new int[]{1,2,1,10}));
        assertEquals(10, Main976.largestPerimeter(new int[]{3,2,3,4}));
    }

}