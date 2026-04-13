package leetcode.easy.task_0020_valid_parentheses;

import java.util.*;

public class Solution20 {

    public boolean isValid(String s) {

        Deque<Character> openedBracketsStack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '{' -> openedBracketsStack.push('}');
                case '(' -> openedBracketsStack.push(')');
                case '[' -> openedBracketsStack.push(']');
                default -> {
                    if (openedBracketsStack.isEmpty() || openedBracketsStack.pop() != c) {
                        return false;
                    }
                }
            }
        }
        return openedBracketsStack.isEmpty();
    }
}
