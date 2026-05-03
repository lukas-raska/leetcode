package leetcode.quests.dataStructuresAndAlgorithms.stack.Q2_evaluateReversePolishNotation;

public class SolutionQ2 {


    public int evalRPN(String[] tokens) {

        int[] stack = new int[tokens.length];
        int stackSize = 0;
        for (String token : tokens) {
            if ("+-*/".contains(token)) {
                int second = stack[--stackSize];
                int first = stack[--stackSize];
                int result = evaluate(token, first, second);
                stack[stackSize++] = result;
            } else {
                stack[stackSize++] = Integer.parseInt(token);
            }
        }
        return stack[0];

    }


    private int evaluate(String operator,
                         int first,
                         int second) {

        return switch (operator) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> {
                if (second == 0) {
                    throw new IllegalStateException("Cannot evaluate division: %d/%d".formatted(first, second));
                } else {
                    yield first / second;
                }
            }
            default -> throw new IllegalArgumentException("Cannot evaluate. Unknown operator: " + operator);
        };

    }


}
