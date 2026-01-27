package leetcode.easy.task_1200_minimum_absolute_difference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1200 {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = arr[1] - arr[0];
        List<List<Integer>> results = new ArrayList<>();
        results.add(List.of(arr[0], arr[1]));
        for (int i = 1; i < arr.length - 1; i++) {
            int curr = arr[i];
            int next = arr[i + 1];
            int diff = next - curr;
            if (diff == minDiff) {
                results.add(List.of(curr, next));
            }
            if (diff < minDiff) {
                minDiff = diff;
                results.clear();
                results.add(List.of(curr, next));
            }
        }
        return results;
    }
}
