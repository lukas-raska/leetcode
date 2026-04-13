package leetcode.medium.task_0019_remove_Nth_node_from_end_of_list;


import java.util.ArrayList;
import java.util.List;

public class Solution19 {

    public ListNode removeNthFromEnd(ListNode head,
                                     int n) {

        List<ListNode> listNodes = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            listNodes.add(current);
            current = current.next;
        }
        int size = listNodes.size();
        int indexToRemove = size - n;
        if (indexToRemove == 0) {
            return (head.next != null) ? head.next : null;
        }
        listNodes.get(indexToRemove - 1).next = listNodes.get(indexToRemove).next;

        return head;
    }


}
