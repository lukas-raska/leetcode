package leetcode.easy.task_2432_the_employee_that_worked_on_the_longest_task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2432Test {

    private Solution2432 solution2432 = new Solution2432();

    @Test
    public void example1(){
        int n = 10;
        int[][]logs = {{0,3},{2,5},{0,9},{1,15}};
        assertEquals(1, solution2432.hardestWorker(n,logs));
    }

    @Test
    public void example2(){
        int n = 70;
        int[][]logs = {{36,3},{1,5},{12,8},{25,9},{53,11},{29,12},{52,14}};
        assertEquals(12, solution2432.hardestWorker(n,logs));
    }



}