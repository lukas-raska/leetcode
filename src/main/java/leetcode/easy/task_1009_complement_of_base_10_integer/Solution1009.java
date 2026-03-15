package leetcode.easy.task_1009_complement_of_base_10_integer;

import java.util.BitSet;

public class Solution1009 {

    public static void main(String[] args) {
        Solution1009 solution1009 = new Solution1009();

        System.out.println(solution1009.bitwiseComplement(10));
    }

    public int bitwiseComplement(int n){

        String nBinary = Integer.toBinaryString(n);
        StringBuilder flipped = new StringBuilder(nBinary.length());
        for (int i = 0; i < nBinary.length() ; i++) {
            flipped.append(nBinary.charAt(i) == '0'? 1:0);
        }
        return Integer.parseInt(flipped.toString(),2);
    }
}
