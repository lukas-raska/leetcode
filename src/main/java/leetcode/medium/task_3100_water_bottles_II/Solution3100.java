package leetcode.medium.task_3100_water_bottles_II;

public class Solution3100 {

    public int maxBottlesDrunk(int numBottles,
                               int numExchange) {
        int total = 0;
        int emptyBottles = 0;

        while (numBottles > 0 || emptyBottles > numExchange) {
            if (numBottles > 0) {
                emptyBottles += numBottles;
                total += numBottles;
                numBottles = 0;
            }
            if (emptyBottles >= numExchange) {
                emptyBottles -= numExchange;
                numBottles++;
                numExchange++;
            }
        }

        return total;

    }
}
