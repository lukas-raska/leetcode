package leetcode.easy.task_1189_maximum_number_of_baloon;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution1189 {

    public int maxNumberOfBalloons(String text) {
        final int[] balon = new int[5]; //0 - b, 1 - a, 2 - l, 3 - o, 4 - n

        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b' -> balon[0]++;
                case 'a' -> balon[1]++;
                case 'l' -> balon[2]++;
                case 'o' -> balon[3]++;
                case 'n' -> balon[4]++;
            }
        }
        balon[2]/=2;
        balon[3]/=2;
        int possibleBaloons = text.length();
        for(int n:balon){
            possibleBaloons = Math.min(possibleBaloons, n);
        }
        return possibleBaloons;
    }
}
