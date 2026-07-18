package leetcode.medium.task_1291_sequentialDigits;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution1291 {

    public List<Integer> sequentialDigits(int low,
                                          int high) {

        List<Integer> allSequentials = generateSequentialNumbers();
        List<Integer> result = new ArrayList<>();

        for (int n : allSequentials) {
            if (n >= low && n <= high) {
                result.add(n);
            }
        }

        return result;
    }


    private List<Integer> generateSequentialNumbers() {

        final int MAX_LIMIT = 1_000_000_000;

        int min = 12;
        int n = min;
        int adj = 11;
        int currentLimit = 100;
        int a = 0;

        List<Integer> result = new ArrayList<>();
        while (currentLimit <= MAX_LIMIT) {

            if (n < currentLimit) {
                if (n <= currentLimit - (a * adj)) {
                    result.add(n);
                }
                n += adj;
            } else {
                adj += currentLimit;
                currentLimit *= 10;
                n = min + adj;
                min = n;
                a++;
            }
        }
        return result;
    }
}
