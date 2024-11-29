package leetcode.task_0002_add_two_numbers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0002 {

    public ListNode addTwoNumbers(ListNode l1,
                                  ListNode l2) {

        BigInteger num1 = getListNodeDigitsAsNumber(l1);
        BigInteger num2 = getListNodeDigitsAsNumber(l2);
        BigInteger sum = num1.add(num2);

        List<Integer> result = new ArrayList<>((sum.equals(BigInteger.ZERO)) ? List.of(0) : new ArrayList<>());

        while (!sum.equals(BigInteger.ZERO)) {
            result.add(sum.remainder(BigInteger.TEN).intValue());
            sum = sum.divide(BigInteger.TEN);
        }

        ListNode node = new ListNode(result.getFirst());
        ListNode current = node;
        for (int i = 1; i < result.size(); i++) {
            current.next = new ListNode(result.get(i));
            current = current.next;
        }
        return node;

    }

    private BigInteger getListNodeDigitsAsNumber(ListNode node) {
        BigInteger multiplier = BigInteger.ONE;
        BigInteger result = BigInteger.ZERO;
        ListNode current = node;
        while (current != null) {
            result = result.add(BigInteger.valueOf((long) current.val).multiply(multiplier));
            multiplier = multiplier.multiply(BigInteger.TEN);
            current = current.next;
        }
        return result;
    }

    public static ListNode parseListNode(String data) {
        int[] numbers = Arrays.stream(data.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        ListNode node = new ListNode(numbers[0]);

        ListNode current = node;
        for (int i = 1; i < numbers.length; i++) {
            current.next = new ListNode(numbers[i]);
            current = current.next;
        }
        return node;
    }


}
