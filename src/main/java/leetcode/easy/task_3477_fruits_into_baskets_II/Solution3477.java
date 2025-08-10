package leetcode.easy.task_3477_fruits_into_baskets_II;

public class Solution3477 {

    public int numOfUnplacedFruits(int[] fruits,
                                   int[] baskets) {
        int unplaced = 0;
        int length = fruits.length;
        boolean[] usedBaskets = new boolean[length];
        for (int fruit : fruits) {
            boolean basketFound = false;
            for (int j = 0; j < length; j++) {
                if (fruit <= baskets[j] && !usedBaskets[j]) {
                    usedBaskets[j] = true;
                    basketFound = true;
                    break;
                }
            }
            if (!basketFound) {
                unplaced++;
            }
        }
        return unplaced;
    }
}
