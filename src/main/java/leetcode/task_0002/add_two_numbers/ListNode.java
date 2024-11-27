package leetcode.task_0002.add_two_numbers;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

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



    public static ListNode arrayListToListNode(List<Integer>list) {

        if (list.isEmpty()){
            return null;
        }

        ListNode node = new ListNode(list.getFirst());
        ListNode current = node;
        for (int i = 1; i < list.size(); i++) {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        return node;
    }

    public static List<Integer> listNodeToArrayList(ListNode node){
        List<Integer> result = new ArrayList<>();
        ListNode current = node;
        while (current!=null){
            result.add(current.val);
            current=current.next;
        }
        return result;
    }

    public static int[] listNodeToArray(ListNode node){
        return listNodeToArrayList(node).stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }


}
