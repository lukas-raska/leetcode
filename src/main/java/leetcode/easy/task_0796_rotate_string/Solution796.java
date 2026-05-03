package leetcode.easy.task_0796_rotate_string;

public class Solution796 {

    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()){
            return false;
        }

        for (int i = 0; i < s.length() ; i++) {
            String shifted = s.substring(i) + s.substring(0,i);
            if (shifted.equals(goal)){
                return true;
            }
        }

        return false;
    }
}
