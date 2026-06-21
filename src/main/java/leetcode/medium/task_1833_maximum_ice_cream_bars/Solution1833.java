package leetcode.medium.task_1833_maximum_ice_cream_bars;

import java.util.Arrays;

public class Solution1833 {

    public int maxIceCream(int[] costs,
                           int coins) {

        Arrays.sort(costs);
        int purchased = 0;
        int index = 0;
        while (index < costs.length && coins >= costs[index]) {
            coins -= costs[index++];
            purchased++;
        }
        return purchased;
    }
}
