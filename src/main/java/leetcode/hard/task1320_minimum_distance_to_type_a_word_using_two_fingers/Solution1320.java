package leetcode.hard.task1320_minimum_distance_to_type_a_word_using_two_fingers;

import java.util.Arrays;

public class Solution1320 {

    private static final char START = 'A';
    private static final char END = 'Z';
    private static final int ROW_LENGTH = 6;
    private static final int INITIAL_VALUE = -1;
    private static final int INITIAL_FINGER_STATE = (END - START + 1);
    private static final int[][] distances;
    private int[][] minCostMemory;


    static {
        int size = END - START + 1;
        distances = new int[size][size];
        for (int i = 0; i < size; i++) {
            int row1 = i / ROW_LENGTH;
            int col1 = i % ROW_LENGTH;
            for (int j = 0; j < size; j++) {
                int row2 = j / ROW_LENGTH;
                int col2 = j % ROW_LENGTH;
                distances[i][j] = Math.abs(row2 - row1) + Math.abs(col2 - col1);
            }
        }
    }

    private int moveFinger(char[] letters,
                           int letterIdx,
                           int otherFingerState) {

        // end of the word reached
        if (letterIdx == letters.length) {
            return 0;
        }

        // stored in memory? return it
        if (minCostMemory[letterIdx][otherFingerState] != INITIAL_VALUE) {
            return minCostMemory[letterIdx][otherFingerState];
        }

        // if not stored, count distances and costs for 2 options

        //option 1 - moving with current finger
        int currentStepCost1 = getDistance(letters[letterIdx - 1], letters[letterIdx]);
        int followingStepsCost1 = moveFinger(letters, letterIdx + 1, otherFingerState);
        int totalCost1 = currentStepCost1 + followingStepsCost1;

        //option 2 - moving with other finger
        int currentStepCost2 = (otherFingerState == INITIAL_FINGER_STATE) ?
                0 : getDistance((char) (START + otherFingerState), letters[letterIdx]);
        int otherStepsCost2 = moveFinger(letters, letterIdx + 1, letters[letterIdx - 1] - START);
        int totalCost2 = currentStepCost2 + otherStepsCost2;

        //store minimum of both values and return it
        int minCost = Math.min(totalCost1, totalCost2);
        minCostMemory[letterIdx][otherFingerState] = minCost;

        return minCost;
    }


    public int minimumDistance(String word) {

        //minCostMemory[x][y] - min cost reaching letter 'x' for current finger, when other finger is in state 'y'
        // x - current letter to reach
        // y - other finger state (START... END + 1 UNUSED state)
        int possibleStates = END - START + 2;
        minCostMemory = new int[word.length()][possibleStates];
        for (int[] costs : minCostMemory) {
            Arrays.fill(costs, INITIAL_VALUE);
        }

        return moveFinger(word.toCharArray(), 1, INITIAL_FINGER_STATE);
    }

    private int getDistance(char a,
                            char b) {
        return distances[a - START][b - START];
    }
}
