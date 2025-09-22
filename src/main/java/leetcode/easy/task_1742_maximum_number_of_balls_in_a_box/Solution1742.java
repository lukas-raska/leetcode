package leetcode.easy.task_1742_maximum_number_of_balls_in_a_box;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution1742 {

    public int countBalls(int lowLimit,
                          int highLimit) {
        Map<Integer, Integer> boxesBallsMap = new HashMap<>(); //key - box number, val - count of balls
        for (int i = lowLimit; i <= highLimit; i++) {
            boxesBallsMap.merge(sumOfDigits(i), 1, Integer::sum);
        }

        return Collections.max(boxesBallsMap.values());
    }

    private int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
