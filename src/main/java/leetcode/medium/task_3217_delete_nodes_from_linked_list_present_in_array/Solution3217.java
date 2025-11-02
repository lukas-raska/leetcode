package leetcode.medium.task_3217_delete_nodes_from_linked_list_present_in_array;

import java.util.*;
import java.util.stream.Collectors;

public class Solution3217 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this(val, null);
        }

        ListNode(int val,
                 ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode modifiedList(int[] nums,
                                 ListNode head) {

//        Set<Integer> numSet = Arrays.stream(nums)
//                .boxed()
//                .collect(Collectors.toSet());

        Set<Integer> numSet = new HashSet<>(nums.length);
        for(int num: nums){
            numSet.add(num);
        }

        //řešení čísel na začátku
        while (numSet.contains(head.val)) {
            head = head.next;
        }

        ListNode prev = head;
        ListNode current = head.next;
        while (current != null) {
            if (numSet.contains(current.val)) {
                prev.next = current.next;
                current = prev.next;
            } else {
                prev = prev.next;
                current = current.next;
            }
        }
        return head;
    }
}
