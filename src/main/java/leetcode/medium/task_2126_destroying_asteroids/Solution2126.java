package leetcode.medium.task_2126_destroying_asteroids;

import java.util.*;

public class Solution2126 {


    public boolean asteroidsDestroyed(int mass,
                                      int[] asteroids) {

        final int MAX_ASTEROID_MASS = 500_000;
        int size = asteroids.length;
        int[] rest = new int[size];
        int restSize = 0;

        boolean found;
        do {
            found = false;
            for (int i = 0; i < size; i++) {

                if (mass >= MAX_ASTEROID_MASS) {
                    return true;
                }

                if (asteroids[i] <= mass) {
                    mass += asteroids[i];
                    found = true;
                } else {
                    rest[restSize++] = asteroids[i];
                }
            }
            if (restSize == 0) {
                return true;
            } else {
                asteroids = rest;
                size = restSize;
                restSize = 0;
            }
        }
        while (found);

        return false;
    }

    public boolean asteroidsDestroyed2(int mass,
                                       int[] asteroids) {

        final int MAX_ASTEROID_MASS = 500_000;
        Arrays.sort(asteroids);
        for (int a : asteroids) {
            if (a <= mass) {
                mass += a;
            } else {
                return false;
            }
            if (mass > MAX_ASTEROID_MASS) {
                break;
            }
        }
        return true;
    }


}
