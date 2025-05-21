package leetcode.easy.task_3492_maximum_containers_on_a_ship;

public class Solution3492 {

    public int maxContainers(int n,
                             int w,
                             int maxWeight) {
        return Math.min(n * n, maxWeight / w);
    }
}
