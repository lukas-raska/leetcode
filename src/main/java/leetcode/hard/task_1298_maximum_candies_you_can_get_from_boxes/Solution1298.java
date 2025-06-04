package leetcode.hard.task_1298_maximum_candies_you_can_get_from_boxes;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Solution1298 {

    public int maxCandies(int[] status,
                          int[] candies,
                          int[][] keys,
                          int[][] containedBoxes,
                          int[] initialBoxes) {
        int sum = 0;
        int totalBoxes = candies.length;
        boolean[] discoveredLocked = new boolean[totalBoxes];
        Deque<Integer> boxQueue = new LinkedList<>();

        for (var boxIndex : initialBoxes) {
            if (status[boxIndex] == 1) {
                boxQueue.add(boxIndex);
            } else {
                discoveredLocked[boxIndex] = true;
            }
        }

        while (!boxQueue.isEmpty()) {

            var currentBoxIndex = boxQueue.pop();
            sum += candies[currentBoxIndex];

            if (keys[currentBoxIndex] != null) {
                for (var key : keys[currentBoxIndex]) {
                    status[key] = 1;
                }
            }

            if (containedBoxes[currentBoxIndex] != null) {
                for (var boxIndex : containedBoxes[currentBoxIndex]) {
                    if (status[boxIndex] == 1) {
                        boxQueue.add(boxIndex);
                    } else {
                        discoveredLocked[boxIndex] = true;
                    }
                }
            }

            for (int i = 0; i < totalBoxes; i++) {
                if (discoveredLocked[i] && status[i] == 1) {
                    boxQueue.add(i);
                    discoveredLocked[i] = false;
                }
            }
        }
        return sum;
    }


}
