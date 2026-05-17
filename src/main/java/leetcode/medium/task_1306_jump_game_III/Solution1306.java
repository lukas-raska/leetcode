package leetcode.medium.task_1306_jump_game_III;

public class Solution1306 {

    public boolean canReach(int[] arr,
                            int start) {

        if (arr[start] == 0){
            return true;
        }

        boolean[] visited = new boolean[arr.length];
        int[] targets = new int[arr.length];
        int top = -1;
        targets[++top] = start;

        int idx;

        while (top >= 0) {
            idx = targets[top--];
            visited[idx] = true;
            if (arr[idx] == 0) {
                return true;
            }
            int leftJump = idx - arr[idx];
            if (leftJump >= 0 && !visited[leftJump]) {
                targets[++top] = leftJump;
            }

            int rightJump = idx + arr[idx];
            if (rightJump < arr.length && !visited[rightJump]) {
                targets[++top] = rightJump;
            }
        }

        return false;
    }
}
