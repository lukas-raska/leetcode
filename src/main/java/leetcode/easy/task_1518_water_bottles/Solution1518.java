package leetcode.easy.task_1518_water_bottles;

public class Solution1518 {

    public int numWaterBottles(int numBottles,
                               int numExchange) {
        int drinked = numBottles;
        int empty = numBottles;
        while (empty >= numExchange) {
            int newBottles = empty / numExchange;
            drinked += newBottles;
            empty -= (newBottles * numExchange);
            empty += newBottles;
        }
        return drinked;
    }
}
