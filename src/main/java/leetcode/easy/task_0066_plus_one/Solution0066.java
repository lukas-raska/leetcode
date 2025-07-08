package leetcode.easy.task_0066_plus_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution0066 {

    public int[] plusOne2(int[] digits) {
        int len = digits.length;
        int[] result = Arrays.copyOf(digits, len);
        int index = len - 1;
        result[index]++;

        while (result[index] == 10 && index > 0) {
            result[index] = 0;
            result[index - 1]++;
            index--;
        }

        if (result[0] == 10) {
            int[] result2 = new int[len + 1];
            result2[0] = 1;
            for (int i = 2; i < result2.length - 1; i++) {
                result2[i] = result[i - 1];
            }
            return result2;
        }

        return result;
    }

    public int[] plusOne(int[] digits) {

        int length = digits.length;
        List<Integer> result = new ArrayList<>(length + 1);
        for (int digit : digits) {
            result.add(digit);
        }
        int index = length - 1;
        result.set(index, result.get(index) + 1);

        while (result.get(index) == 10 && index > 0) {
            result.set(index, 0);
            result.set(index - 1, result.get(index - 1) + 1);
            index--;
        }

        if (result.getFirst() == 10) {
            result.addFirst(1);
            result.set(1, 0);
        }
        int [] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
