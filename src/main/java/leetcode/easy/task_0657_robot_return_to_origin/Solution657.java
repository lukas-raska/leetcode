package leetcode.easy.task_0657_robot_return_to_origin;

public class Solution657 {

    public boolean judgeCircle(String moves) {
        int U = 0, D = 0, L = 0;
        for(char c:moves.toCharArray()){
            if (c == 'U'){
                U++;
            }
            if (c == 'D'){
                D++;
            }
            if (c == 'L'){
                L++;
            }
        }
        int R = moves.length() - U - D - L;

        return L == R && U == D;
    }
}
