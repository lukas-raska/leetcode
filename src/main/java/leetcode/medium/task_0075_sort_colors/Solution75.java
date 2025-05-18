package leetcode.medium.task_0075_sort_colors;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution75 {


    public static void main(String[] args) {
        Solution75 solution75 = new Solution75();
        solution75.sortColors2(new int[]{2, 0, 2, 1, 1, 0});
    }

    public void sortColors(int[] nums) {
        var colorMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        var sortedColors = colorMap.keySet().stream()
                .sorted()
                .toList();

        int index = 0;
        for (var currentColor : sortedColors) {
            int currentColorAmount = Math.toIntExact(colorMap.get(currentColor));
            Arrays.fill(nums, index, index + currentColorAmount, currentColor);
            index += currentColorAmount;
        }
    }

    public void sortColors2(int[] nums) {
        int[] colors = new int[3];
        for (int num : nums) {
            colors[num]++;
        }
        int index = 0;
        for (int i = 0; i < colors.length; i++) {
            Arrays.fill(nums, index, index + colors[i], i);
            index += colors[i];
        }
    }
}
