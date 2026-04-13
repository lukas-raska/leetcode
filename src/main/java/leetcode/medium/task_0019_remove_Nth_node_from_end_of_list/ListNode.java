package leetcode.medium.task_0019_remove_Nth_node_from_end_of_list;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {this.val = val;}

    ListNode(int val,
             ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode arrayToListNode(int[] data) {

        ListNode head = new ListNode();
        ListNode current = head;
        for (int i = 0; i < data.length; i++) {
            current.val = data[i];
            if (i < data.length -1){
                current.next = new ListNode();
                current = current.next;
            }

        }

        return head;
    }

    public static int[] listNodeToArray(ListNode head){
        List<Integer> nums = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            nums.add(current.val);
            current = current.next;
        }
        int [] result = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            result[i]=nums.get(i);
        }
        return result;
    }
}
