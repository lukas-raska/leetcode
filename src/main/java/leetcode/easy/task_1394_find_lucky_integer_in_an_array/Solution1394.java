package leetcode.easy.task_1394_find_lucky_integer_in_an_array;

public class Solution1394 {

    public int findLucky(int[] arr) {
        int[] frequencies = new int[501];
        for (int i : arr) {
            frequencies[i]++;
        }
        for (int i = frequencies.length - 1; i > 0; i--) {
            if (i == frequencies[i]) {
                return i;
            }
        }
        return -1;
    }
}
