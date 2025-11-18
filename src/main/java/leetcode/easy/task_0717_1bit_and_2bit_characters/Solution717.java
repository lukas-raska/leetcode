package leetcode.easy.task_0717_1bit_and_2bit_characters;

public class Solution717 {

    public boolean isOneBitCharacter(int[] bits) {

        if (bits.length < 2) {
            return true;
        }
        if (bits[bits.length - 1] == 1) {
            return false;
        }
        int lastZeroIndex = -1;
        for (int i = bits.length - 2; i >= 0; i--) {
            if (bits[i] == 0) {
                lastZeroIndex = i;
                break;
            }
        }
        if (lastZeroIndex == -1) {
            return bits.length % 2 != 0;
        }

        return (bits.length - lastZeroIndex - 1) % 2 != 0;
    }
}
