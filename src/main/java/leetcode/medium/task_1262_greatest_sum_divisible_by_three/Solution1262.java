package leetcode.medium.task_1262_greatest_sum_divisible_by_three;

public class Solution1262 {

    public int maxSumDivThree(int[] nums) {

        int sum = 0;

        int min1a = Integer.MAX_VALUE;
        int min1b = Integer.MAX_VALUE;
        int min2a = Integer.MAX_VALUE;
        int min2b = Integer.MAX_VALUE;

        for (int n : nums) {

            sum += n;

            switch (n % 3) {
                case 1 -> {
                    if (n < min1a) {
                        min1b = min1a;
                        min1a = n;
                    } else if (n < min1b) {
                        min1b = n;
                    }
                }
                case 2 -> {
                    if (n < min2a) {
                        min2b = min2a;
                        min2a = n;
                    } else if (n < min2b) {
                        min2b = n;
                    }
                }
            }
        }

        int sumMod3 = sum % 3;

        if (sumMod3 == 0){
            return sum;
        }

        int option1 = Integer.MAX_VALUE;
        int option2 = Integer.MAX_VALUE;

        if (sumMod3 == 1) {
            if (min1a != Integer.MAX_VALUE) option1 = min1a;          // 1 prvek mod1
            if (min2a != Integer.MAX_VALUE && min2b != Integer.MAX_VALUE) option2 = min2a + min2b; // 2 prvky mod2
        } else if (sumMod3 == 2) {
            if (min2a != Integer.MAX_VALUE) option1 = min2a;          // 1 prvek mod2
            if (min1a != Integer.MAX_VALUE && min1b != Integer.MAX_VALUE) option2 = min1a + min1b; // 2 prvky mod1
        }

        return sum - Math.min(option1, option2);

    }

    public static void main(String[] args) {

        Solution1262 solution1262 = new Solution1262();

        solution1262.maxSumDivThree(new int[]{1, 1, 3});
    }


}
