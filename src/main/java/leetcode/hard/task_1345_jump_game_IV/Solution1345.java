package leetcode.hard.task_1345_jump_game_IV;

import java.util.*;

public class Solution1345 {

    public int minJumps(int[] arr) {

        if (arr.length == 1) {
            return 0;
        }

        if (arr.length > 1 && arr[0] == arr[arr.length - 1]) {
            return 1;
        }

        Map<Integer, List<Integer>> mappedIndexes = mapIndexesByValue(arr);

        boolean[] visited = new boolean[arr.length];
        int distance = 0;

        boolean reachedLast = false;

        List<Integer> currentLevel = new ArrayList<>(List.of(0));
        visited[0] = true;
        List<Integer> nextLevel = new ArrayList<>();
        Set<Integer> usedValues = new HashSet<>();

        while (!reachedLast) {

            distance++;

            for (int index : currentLevel) {
                int leftNeighbour = index - 1;
                int rightNeighbour = index + 1;
                if (rightNeighbour == arr.length - 1) {
                    reachedLast = true;
                    break;
                }
                if (leftNeighbour >= 0 && !visited[leftNeighbour]) {
                    nextLevel.add(leftNeighbour);
                    visited[leftNeighbour] = true;
                }
                if (rightNeighbour < arr.length && !visited[rightNeighbour]) {
                    nextLevel.add(rightNeighbour);
                    visited[rightNeighbour] = true;
                }
                if (!usedValues.contains(arr[index])) {
                    usedValues.add(arr[index]);
                    for (int jumpIdx : mappedIndexes.get(arr[index])) {
                        if (jumpIdx == arr.length - 1) {
                            reachedLast = true;
                            break;
                        }
                        if (!visited[jumpIdx]) {
                            nextLevel.add(jumpIdx);
                            visited[jumpIdx] = true;
                        }
                    }
                }
            }

            currentLevel = nextLevel;
            nextLevel = new ArrayList<>();
        }
        return distance;
    }

    private Map<Integer, List<Integer>> mapIndexesByValue(int[] arr) {
        Map<Integer, List<Integer>> mappedIndexes = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mappedIndexes.putIfAbsent(arr[i], new ArrayList<>());
            mappedIndexes.get(arr[i]).add(i);
        }
        return mappedIndexes;
    }

}
