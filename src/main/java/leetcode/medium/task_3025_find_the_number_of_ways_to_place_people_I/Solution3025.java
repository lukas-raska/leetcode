package leetcode.medium.task_3025_find_the_number_of_ways_to_place_people_I;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Solution3025 {

    public int numberOfPairs(int[][] points) {

        Comparator<int[]> comparator =
                Comparator
                        .comparing((int[] o) -> o[0])
                        .thenComparing((o1, o2) -> Integer.compare(o2[1], o1[1]));
        Arrays.sort(points, comparator);
        int pairs = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int[] topLeft = points[i];
            for (int j = i + 1; j < points.length; j++) {
                int[] next = points[j];
                if (next[1]>topLeft[1]){
                    continue;
                }
                if (isNoPointBetween(i, j, points)) {
                    pairs++;
                }
            }
        }
        return pairs;
    }



    private boolean isNoPointBetween(int topLeftIdx,
                                     int bottomRightIdx,
                                     int[][] points) {
        int[] topLeft = points[topLeftIdx];
        int[] bottomRight = points[bottomRightIdx];
        List<int[]> testedSublist = Arrays.asList(points).subList(topLeftIdx, bottomRightIdx + 1);
        long pointsInArea = testedSublist.stream()
                .filter(point-> point[0]>=topLeft[0]&& point[0]<=bottomRight[0])
                .filter(point -> point[1]<=topLeft[1]&& point[1]>=bottomRight[1])
                .count();
        return pointsInArea == 2;
    }
}
