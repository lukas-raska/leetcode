package leetcode.quests.dataStructuresAndAlgorithms.array_I.Q3_maxConsecutiveOnes;

public class SolutionQ3 {

    public int findMaxConsecutiveOnes(int[] nums) {

        int current = 0, max = 0;

        for (int n : nums) {
            current = (n == 1) ? current + 1 : 0;
            max = Math.max(current, max);
        }
        return max;
    }
}
