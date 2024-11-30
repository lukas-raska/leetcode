package leetcode.task_0011_container_with_most_water;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution0011 {

    public int maxArea(int[] height) {

        if (height == null || height.length < 2) {
            return 0;
        }

        int maxArea = 0;
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int leftHeight, rightHeight, area;

        while (leftIndex < rightIndex) {

            leftHeight = height[leftIndex];
            rightHeight = height[rightIndex];

            area = (rightIndex - leftIndex) * Math.min(leftHeight, rightHeight);
            maxArea = Math.max(area, maxArea);

            if (leftHeight < rightHeight) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        return maxArea;
    }
}
