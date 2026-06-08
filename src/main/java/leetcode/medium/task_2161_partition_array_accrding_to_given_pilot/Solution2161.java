package leetcode.medium.task_2161_partition_array_accrding_to_given_pilot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution2161 {

    public int[] pivotArray(int[] nums,
                            int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();
        int pivotCnt = 0;
        for (int n : nums) {
            if (n < pivot) {
                smaller.add(n);
            } else if (n > pivot) {
                larger.add(n);
            } else {
                pivotCnt++;
            }
        }
        List<Integer> pivotList = Collections.nCopies(pivotCnt, pivot);
        int [] result = new int[smaller.size()+pivotList.size()+ larger.size()];
        for (int i = 0; i < smaller.size(); i++) {
            result[i]= smaller.get(i);
        }
        for (int i = smaller.size(); i < smaller.size() + pivotList.size(); i++) {
            result[i]= pivotList.get(i);
        }
        for (int i = smaller.size() + pivotList.size(); i < smaller.size()+pivotList.size()+ larger.size(); i++) {
            result[i]= larger.get(i);
        }
        return result;
    }
}
