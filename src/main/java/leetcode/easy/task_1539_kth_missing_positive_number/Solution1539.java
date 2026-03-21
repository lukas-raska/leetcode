package leetcode.easy.task_1539_kth_missing_positive_number;

public class Solution1539 {

    public int findKthPositive(int[] arr,
                               int k) {

        int missingFound = 0;

        //before array
        if (arr[0] > 1) {
            for (int i = 1; i < arr[0]; i++) {
                missingFound++;
                if (missingFound == k) {
                    return i;
                }
            }
        }

        //in array
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];

            if (diff > 1) {
                for (int j = 1; j < diff; j++) {
                    missingFound++;
                    if (missingFound == k) {
                        return arr[i - 1] + j;
                    }
                }
            }
        }

        //after array
        return arr[arr.length - 1] + (k - missingFound);
    }
}
