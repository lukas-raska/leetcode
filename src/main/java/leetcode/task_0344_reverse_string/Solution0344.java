package leetcode.task_0344_reverse_string;

public class Solution0344 {

    public void reverseString(char[] s) {
        char a;
        for (int i = 0; i < s.length / 2; i++) {
            a = s[s.length - 1 - i];
            s[s.length - 1 - i] = s[i];
            s[i] = a;
        }
    }
}
