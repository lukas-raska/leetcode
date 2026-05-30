package leetcode.hard.task_3161_block_placement_queries;

import java.util.*;

public class Solution3161 {

    /*
    works, but fails on TLE
     */
    public List<Boolean> getResults(int[][] queries) {

        List<Boolean> result = new ArrayList<>();
        SortedSet<Integer> obstacles = new TreeSet<>(Comparator.naturalOrder());
        obstacles.add(0);

        for (int[] query : queries) {

            if (query.length == 2) {
                obstacles.add(query[1]);

            } else {

                boolean canBePlaced = obstacles.size() == 1 && query[1] >= query[2];

                var it = obstacles.headSet(query[1]).iterator();

                if (query[1] >= query[2]) {
                    int prev = it.next();
                    while (it.hasNext()) {
                        int next = it.next();
                        if (query[2] <= next - prev) {
                            canBePlaced = true;
                            break;
                        }
                        prev = next;
                    }

                    if (!canBePlaced) {
                        canBePlaced = query[1] - prev >= query[2];
                    }
                }

                result.add(canBePlaced);
            }
        }
        return result;
    }
}
