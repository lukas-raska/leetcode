package leetcode.medium.task_2126_destroying_asteroids;

import java.util.*;

public class Solution2126 {

    public boolean asteroidsDestroyed(int mass,
                                      int[] asteroids) {

        Arrays.sort(asteroids);

        long currentMass = mass;
        long massGained = 0;
        int lastDestroyed = -1;
        for (int i = 0; i < asteroids.length; i++) {

            if (asteroids[i] <= currentMass) {
                massGained += asteroids[i];
                lastDestroyed = i;
            } else {
                currentMass += massGained;
                massGained = 0;
                if (asteroids[i] <= currentMass) {
                    lastDestroyed = i;
                    currentMass += asteroids[i];
                } else {
                    break;
                }
            }
        }

        return lastDestroyed == asteroids.length - 1;
    }
}
