package leetcode.easy.task_3507_minimum_pair_removal_to_sort_array_I;

import java.util.ArrayList;
import java.util.List;

public class Solution3507 {

    public int minimumPairRemoval(int[] nums) {

        int operations = 0;
        int size = nums.length;
        List<Integer> numbers = new ArrayList<>(size);
        for (int num : nums) {
            numbers.add(num);
        }

        while (!isNonDecreasing(numbers)) {

            int indexOfMin = 0;
            int minSum = Integer.MAX_VALUE;
            int current = numbers.getFirst();
            for (int i = 1; i < numbers.size(); i++) {
                int next = numbers.get(i);
                int sum = current + next;
                if (sum < minSum) {
                    minSum = sum;
                    indexOfMin = i - 1;
                }
                current = next;
            }

            int sum = numbers.get(indexOfMin) + numbers.get(indexOfMin+1);
            numbers.set(indexOfMin, sum);
            numbers.remove(indexOfMin + 1);
            operations++;
        }

        return operations;
    }

    private boolean isNonDecreasing(List<Integer> numbers) {
        int current = numbers.getFirst();
        for (int i = 1; i < numbers.size(); i++) {
            int next = numbers.get(i);
            if (next < current) {
                return false;
            }
            current = next;
        }
        return true;
    }
}
