package leetcode.medium.task_2130_maximum_twin_sum_of_a_linked_list;


import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {this.val = val;}

    ListNode(int val,
             ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class Solution2130 {

    public int pairSum(ListNode head) {

        List<Integer> values = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            values.add(node.val);
            node = node.next;
        }
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = values.size() - 1;
        while (left < right) {
            max = Math.max(max, values.get(left++) + values.get(right--));
        }
        return max;
    }
}
