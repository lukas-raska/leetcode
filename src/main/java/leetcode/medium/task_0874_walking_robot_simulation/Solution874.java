package leetcode.medium.task_0874_walking_robot_simulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution874 {


    public int robotSim(int[] commands,
                        int[][] obstacles) {

        final Set<Integer> obstaclesHashSet = Arrays.stream(obstacles)
                .map(pos -> pos[0] * 60001 + pos[1])
                .collect(Collectors.toSet());
        final int[] position = {0, 0}; //x,y
        final int[] direction = {0, 1}; //dx, dy
        int maxDistance = 0;

        for (int command : commands) {
            switch (command) {
                case -1 -> turn('R', direction);
                case -2 -> turn('L', direction);
                default -> {
                    go(position, direction, command, obstaclesHashSet);
                    int distance = position[0] * position[0] + position[1] * position[1];
                    if (distance > maxDistance) {
                        maxDistance = distance;
                    }
                }
            }
        }
        return maxDistance;
    }


    private void turn(char dirChange,
                      int[] direction) {

        int dx = direction[0];
        int dy = direction[1];

        switch (dirChange) {
            case 'L' -> {
                direction[0] = -dy;
                direction[1] = dx;
            }
            case 'R' -> {
                direction[0] = dy;
                direction[1] = -dx;
            }
            default -> throw new IllegalArgumentException("Illegal dirChange value: " + dirChange);
        }
    }

    private void go(int[] position,
                    int[] direction,
                    int distance,
                    Set<Integer> obstacles) {

        int x = position[0];
        int y = position[1];
        int dx = direction[0];
        int dy = direction[1];
        final int[] next = {x, y};

        for (int i = 1; i <= distance; i++) {
            if (dx != 0) {
                next[0] = x + (i * dx);
            }
            if (dy != 0) {
                next[1] = y + (i * dy);
            }
            int nextHash = next[0] * 60001 + next[1];

            if (obstacles.contains(nextHash)) {
                break;
            }
            position[0] = next[0];
            position[1] = next[1];

        }
    }

}
