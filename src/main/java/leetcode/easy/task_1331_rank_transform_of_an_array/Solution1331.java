package leetcode.easy.task_1331_rank_transform_of_an_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1331 {

    public int[] arrayRankTransform(int [] array){

        if (array.length == 0){
            return array;
        }

        int [] sorted = Arrays.stream(array).sorted().toArray();
        int currentRank = 1;
        Map<Integer,Integer> rankMap = new HashMap<>(Map.of(sorted[0],currentRank));

        int prev = sorted[0];

        for (int n :sorted){
            if (n > prev){
                currentRank++;
            }
            rankMap.putIfAbsent(n,currentRank);
            prev = n;
        }

        int [] ranks = new int[sorted.length];
        for (int i = 0; i < sorted.length; i++) {
            ranks[i] = rankMap.get(array[i]);
        }

        return ranks;
    }
}
