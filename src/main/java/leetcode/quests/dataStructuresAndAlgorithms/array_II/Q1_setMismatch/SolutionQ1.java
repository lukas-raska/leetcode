package leetcode.quests.dataStructuresAndAlgorithms.array_II.Q1_setMismatch;

import java.util.Arrays;

public class SolutionQ1 {

    public int[] findErrorNums(int[] nums) {

        int n = nums.length;
        int[] frequencies = new int[n + 1];
        for (int num : nums) {
            frequencies[num]++;
        }

        int[] result = new int[2]; // {duplicate number, missing number}
        boolean duplicateFound = false;
        boolean missingFound = false;
        for (int i = 1; i < n + 1; i++) {
            if (frequencies[i] > 1) {
                duplicateFound = true;
                result[0] = i;
            }
            if (frequencies[i] == 0) {
                missingFound = true;
                result[1] = i;
            }
            if (duplicateFound && missingFound) {
                break;
            }
        }


        return result;
    }


}
