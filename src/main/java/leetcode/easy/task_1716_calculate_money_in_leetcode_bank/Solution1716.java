package leetcode.easy.task_1716_calculate_money_in_leetcode_bank;

public class Solution1716 {

    public int totalMoney(int n) {

        int adj = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (i % 7 == 0) {
                adj++;
            }
            total += adj + i % 7;
        }
        return total;
    }
}
