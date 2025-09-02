package leetcode.medium.task_1792_maximum_average_pass_ratio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Solution1792 {

    public double maxAverageRatio2(int[][] classes,
                                   int extraStudents) {

        for (int i = 0; i < extraStudents; i++) {
            double bestGain = 0;
            int bestClassIdx = 0;
            for (int j = 0; j < classes.length; j++) {
                int pass = classes[j][0];
                int total = classes[j][1];
                double change = (pass + 1) / (double) (total + 1) - pass / (double) total;
                if (change > bestGain) {
                    bestGain = change;
                    bestClassIdx = j;
                }
            }
            classes[bestClassIdx][0]++;
            classes[bestClassIdx][1]++;
        }

        double ratioSum = 0;
        for (int[] cl : classes) {
            ratioSum += (cl[0] / (double) cl[1]);
        }
        return ratioSum / classes.length;
    }

    public double maxAverageRatio(int[][] classes,
                                  int extraStudents) {
        Queue<int[]> queue = new PriorityQueue<>(
                (cl1, cl2) ->
                        Double.compare(
                                getGain(cl2[0], cl2[1]),
                                getGain(cl1[0], cl1[1])
                        ));
        queue.addAll(Arrays.asList(classes));
        for (int i = 0; i < extraStudents; i++) {
            int[] best = queue.poll();
            best[0]++;
            best[1]++;
            queue.offer(new int[]{best[0], best[1]});
        }

        //return getAverage(queue, this::getRatio);
        return queue.stream().mapToDouble(this::getRatio).average().orElseThrow();
    }

    private double getAverage(Queue<int[]>queue, Function<int[],Double> function){
        double sum = 0;
        int size = queue.size();
        for (int[] ints : queue) {
            sum+= function.apply(ints);
        }
        return sum/size;
    }


    private double getGain(int pass,
                           int total) {
        return getRatio(pass + 1, total + 1) - getRatio(pass, total);
    }

    private double getRatio(int pass,
                            int total) {
        return pass / (double) total;
    }

    private double getRatio(int[] studentClass) {
        return getRatio(studentClass[0], studentClass[1]);
    }


}
