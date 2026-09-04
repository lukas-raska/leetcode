package leetcode.medium.task_1386_cinema_seat_allocation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1386 {

    public int maxNumberOfFamilies(int n,
                                   int[][] reservedSeats) {

        Map<Integer, Set<Integer>> reservedSeatsMap = new HashMap<>();
        Map<Set<Integer>, Integer> cache = new HashMap<>();
        int result = 0;

        for (int[] seat : reservedSeats) {
            reservedSeatsMap.putIfAbsent(seat[0], new HashSet<>());
            reservedSeatsMap.get(seat[0]).add(seat[1]);
        }

        for (int i = 1; i <= n; i++) {
            Set<Integer> reserved = reservedSeatsMap.get(i);
            if (reserved == null) {
                result += 2;
            } else {
                if (cache.containsKey(reserved)) {
                    result += cache.get(reserved);
                } else {
                    int groups = countSeatGroups(reserved);
                    cache.put(reserved, groups);
                    result += groups;
                }
            }
        }

        return result;
    }



    private int countSeatGroups(Set<Integer> reserved) {

        if (reserved.size() > 6) {
            return 0;
        }

        if (isLeftAndRightFree(reserved)) {
            return 2;
        }

        if (isLeftFree(reserved) || isRightFree(reserved) || isCenterFree(reserved)) {
            return 1;
        }

        return 0;
    }

    private boolean isLeftFree(Set<Integer> reserved) {
        for (int i = 2; i <= 5; i++) {
            if (reserved.contains(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean isRightFree(Set<Integer> reserved) {
        for (int i = 6; i <= 9; i++) {
            if (reserved.contains(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean isLeftAndRightFree(Set<Integer> reserved) {
        return isLeftFree(reserved) && isRightFree(reserved);
    }

    private boolean isCenterFree(Set<Integer> reserved) {
        for (int i = 4; i <= 7; i++) {
            if (reserved.contains(i)) {
                return false;
            }
        }
        return !isLeftAndRightFree(reserved);
    }


}
