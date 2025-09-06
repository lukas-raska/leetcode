package leetcode.easy.task_2399_check_distances_between_same_letters;

public class Solution2399 {

    public boolean checkDistances(String s,
                                  int[] distance) {

        for (int i = 0, letter = 'a'; i < distance.length; i++, letter++ ) {
            int firstOccur = s.indexOf(letter);
            if (firstOccur < 0) {
                continue;
            }
            int lastOccur = s.lastIndexOf(letter);
            if ((lastOccur - firstOccur - 1) != distance[i]) {
                return false;
            }
        }
        return true;
    }
}
