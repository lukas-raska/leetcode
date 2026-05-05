package leetcode.medium.task_0061_rotate_list;

class ListNode {

    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val,
             ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution61 {

    public ListNode rotateRight(ListNode head,
                                int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int size = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            size++;
        }

        k %= size;
        if (k == 0) {
            return head;
        }

        tail.next = head;

        ListNode newTail = head;
        for (int i = 0; i < size - k - 1; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;


        return newHead;
    }
}
