package leetcode.easy.task_3024_type_of_triangle;

public class Solution3024 {

    public String triangleType(int[] nums) {

        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }
        if (a == b && b == c) {
            return "equilateral";
        }
        if (a == b || a == c || b == c) {
            return "isosceles";
        }
        return "scalene";

    }
}
