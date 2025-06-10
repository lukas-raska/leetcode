package leetcode.easy.task_0292_nim_game;

public class Solution292 {

    //
    // | true
    // || true
    // ||| true
    // |||| false
    // ||||| true
    // |||||| true

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
