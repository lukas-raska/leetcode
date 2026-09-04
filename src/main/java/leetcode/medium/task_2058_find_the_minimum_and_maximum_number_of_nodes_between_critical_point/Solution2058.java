package leetcode.medium.task_2058_find_the_minimum_and_maximum_number_of_nodes_between_critical_point;


//Definition for singly-linked list.
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

public class Solution2058 {

    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int size = size(head);
        boolean[] criticalPoints = new boolean[size];
        ListNode node = head;
        int prevVal, currVal, nextVal;
        for (int i = 1; i < size - 1; i++) {
            prevVal = node.val;
            currVal = node.next.val;
            nextVal = node.next.next.val;
            criticalPoints[i] = (prevVal < currVal && nextVal < currVal) || (prevVal > currVal && nextVal > currVal);
            node = node.next;
        }

        //search for max
        int first = -1;
        int last = -1;
        for (int i = 1; i < size - 2; i++) {
            if (criticalPoints[i]) {
                first = i;
                break;
            }
        }

        if (first == -1) {
            return new int[]{-1, -1};
        }

        for (int i = size - 2; i > 1; i--) {
            if (criticalPoints[i]) {
                last = i;
                break;
            }
        }

        if (last == -1 || last == first) {
            return new int[]{-1, -1};
        }

        int max = last - first;

        //search for min
        int min = Integer.MAX_VALUE;
        for (int i = first; i < size - 2; i++) {
            if (criticalPoints[i]) {
                for (int j = i + 1; j < size - 1; j++) {
                    if (criticalPoints[j]) {
                        min = Math.min(min, j - i);
                        if (min == 1) {
                            return new int[]{min, max};
                        }

                    }
                }
            }
        }
        return new int[]{min, max};

    }

    private int size(ListNode head) {
        ListNode current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

}
