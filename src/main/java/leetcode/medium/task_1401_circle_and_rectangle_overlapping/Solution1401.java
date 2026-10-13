package leetcode.medium.task_1401_circle_and_rectangle_overlapping;

import java.util.Arrays;
import java.util.Comparator;

public class Solution1401 {

    public boolean checkOverlap(int radius,
                                int xCenter,
                                int yCenter,
                                int x1,
                                int y1,
                                int x2,
                                int y2) {

        //left-up
        if (xCenter < x1 && yCenter > y2) {
            return distance(xCenter, yCenter, x1, y2) <= radius;
        }
        // up
        if (xCenter >= x1 && xCenter <= x2 && yCenter > y2) {
            return (yCenter - y2) <= radius;
        }
        // right - up
        if (xCenter > x2 && yCenter > y2) {
            return distance(xCenter, yCenter, x2, y2) <= radius;
        }
        // right
        if (xCenter > x2 && yCenter >= y1) {
            return (xCenter - x2) <= radius;
        }
        // right-down
        if (xCenter > x2) {
            return distance(xCenter, yCenter, x2, y1) <= radius;
        }
        // down
        if (xCenter >= x1 && yCenter < y1) {
            return (y1 - yCenter)<=radius;
        }
        //left - down
        if (xCenter < x1 && yCenter < y1){
            return distance(xCenter,yCenter,x1,y1) <= radius;
        }
        //left
        if (xCenter < x1){
            return (x1 - xCenter) <=radius;
        }

        return true; //is inside
    }

    private double distance(int x1,
                            int y1,
                            int x2,
                            int y2) {

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
