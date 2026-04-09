package leetcode.easy.task_0728_self_dividing_numbers;

import java.util.ArrayList;
import java.util.List;

public class Solution728 {

    public List<Integer> selfDividingNumbers(int left,
                                             int right) {

        List<Integer> results = new ArrayList<>(right - left);

        for (int i = left; i <= right; i++) {
            boolean isValid = true;
            int temp = i;

            while (temp > 0) {
                int digit = temp % 10;
                if (digit == 0 || i % digit != 0) {
                    isValid = false;
                    break;
                }
                temp /= 10;
            }
            if (isValid) {
                results.add(i);
            }
        }
        return results;
    }


}
