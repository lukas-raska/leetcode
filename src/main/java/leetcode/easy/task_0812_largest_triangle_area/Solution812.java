package leetcode.easy.task_0812_largest_triangle_area;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution812 {

    public double largestTriangleArea(int[][] points) {
        double  maxArea = 0;
        for (int i = 0; i < points.length - 2; i++) {
            int[] first = points[i];
            for (int j = i + 1; j < points.length - 1; j++) {
                int[] second = points[j];
                for (int k = j + 1; k < points.length; k++) {
                    int[] third = points[k];
                    double area = getArea(first,second,third);
                    if (area > maxArea){
                        maxArea = area;
                    }
                }
            }
        }
        return maxArea;
    }

    private double getArea(int[] a,
                           int[] b,
                           int[] c) {

        return 0.5 * Math.abs(a[0] * (b[1] - c[1]) + b[0] * (c[1] - a[1]) + c[0] * (a[1] - b[1]));
    }

}



