package leetcode.quests.dataStructuresAndAlgorithms.array_II.Q3_findAllNumbersDisappearedInAnArray;

import java.util.ArrayList;
import java.util.List;

public class SolutionQ3 {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        int n = nums.length;
        int[] frequencies = new int[n + 1];
        List<Integer> missingNumbers = new ArrayList<>();
        for (int num : nums) {
            frequencies[num]++;
        }

        for (int i = 1; i < n + 1 ; i++) {
            if (frequencies[i] == 0) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }
}
