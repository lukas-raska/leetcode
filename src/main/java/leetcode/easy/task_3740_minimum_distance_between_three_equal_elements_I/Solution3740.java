package leetcode.easy.task_3740_minimum_distance_between_three_equal_elements_I;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3740 {

    public int minimumDistance(int[] nums) {

        Map<Integer, int[]> indexesMap = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            indexesMap.putIfAbsent(nums[i], new int[3]);
            var indexes = indexesMap.get(nums[i]);
            int storedIndexes = indexes[0];
            if (storedIndexes < 2) {
                indexes[1 + indexes[0]++]= i;
            } else {
                int distance = distance(indexes[1], indexes [2], i);
                if (distance < minDistance) {
                    minDistance = distance;
                }
                indexes[1] = indexes[2];
                indexes[2] = i;
            }
        }
        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
    }

    public int minimumDistance2(int[] nums) {

        Map<Integer, List<Integer>> indexesMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            indexesMap.putIfAbsent(nums[i], new ArrayList<>(3));
            indexesMap.get(nums[i]).add(i);
        }

        int minDistance = Integer.MAX_VALUE;
        for (var indexes : indexesMap.values()) {
            if (indexes.size() >= 3) {
                for (int i = 0; i < indexes.size() - 2; i++) {
                    int distance = distance(indexes.get(i), indexes.get(i + 1), indexes.get(i + 2));
                    if (distance < minDistance) {
                        minDistance = distance;
                    }
                }
            }
        }

        if (minDistance == Integer.MAX_VALUE) {
            minDistance = -1;
        }

        return minDistance;

    }

    private int distance(int i,
                         int j,
                         int k) {
        int ij = Math.abs(i - j);
        int jk = Math.abs(j - k);
        int ki = Math.abs(k - i);
        return ij + jk + ki;
    }
}
