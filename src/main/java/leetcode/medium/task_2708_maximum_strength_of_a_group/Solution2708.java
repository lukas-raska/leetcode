package leetcode.medium.task_2708_maximum_strength_of_a_group;

public class Solution2708 {

    public long maxStrength(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        long posStr = 0;
        long negStr = 0;
        int maxNeg = -9;
        int negCntr = 0;
        for (int num : nums) {
            if (num != 0) {
                if (num < 0) {
                    negCntr++;
                    maxNeg = Math.max(maxNeg, num);
                    negStr = (negStr == 0) ? negStr + num : negStr * num;
                } else {
                    posStr = (posStr == 0) ? posStr + num : posStr * num;
                }
            }
        }
        if (negCntr <= 1) {
            return posStr;
        }
        negStr = (negCntr % 2 == 0) ? negStr : negStr / maxNeg;

        return (posStr == 0) ? negStr : posStr * negStr;
    }
}
