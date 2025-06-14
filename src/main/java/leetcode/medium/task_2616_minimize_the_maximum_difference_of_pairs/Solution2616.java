package leetcode.medium.task_2616_minimize_the_maximum_difference_of_pairs;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2616 {


    public int minimizeMax(int[] nums,
                           int p) {
        //setřídím pole a použiju binary search
        Arrays.sort(nums);

        int minPossibleDiff = 0;
        int maxPossibleDiff = Math.abs(nums[nums.length - 1] - nums[0]);

        int result = maxPossibleDiff;

        while (minPossibleDiff <= maxPossibleDiff) {
            int mid = minPossibleDiff + (maxPossibleDiff - minPossibleDiff) / 2;

            int count = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                int currDiff = Math.abs(nums[i + 1] - nums[i]);
                // každý rozdíl porovnám se střední hodnotou a počítám jejich počet
                if (currDiff <= mid) {
                    count++;
                    i++; // přeskočíš, protože jsi použil oba indexy
                }
            }
            if (count >= p) {       // pokud se počtem vejdu do zadané hodnoty "p"
                result = mid;       // našel jsem řešení → zkusíme menší diff
                maxPossibleDiff = mid - 1;
            } else {                //pokud se nevejdu...
                minPossibleDiff = mid + 1;   // nešlo to → musím zvýšit rozdíl
            }
        }

        return result;
    }
}
