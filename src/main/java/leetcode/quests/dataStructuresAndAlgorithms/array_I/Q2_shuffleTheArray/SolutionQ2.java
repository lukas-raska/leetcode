package leetcode.quests.dataStructuresAndAlgorithms.array_I.Q2_shuffleTheArray;

public class SolutionQ2 {

    public int[] shuffle(int[] nums,
                         int n) {

        int[] shuffled = new int[nums.length];

        for (int i = 0; i < n; i++) {
            shuffled[2 * i] = nums[i];
            shuffled[2 * i + 1] = nums[i + n];
        }

        return shuffled;
    }
}
