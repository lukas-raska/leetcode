package leetcode.task_0002.add_two_numbers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution0002Test {


    Solution0002 solution0002 = new Solution0002();

    @Test
    void addTwoNumbersTest1() {
        ListNode node1 = Solution0002.parseListNode("2,4,3");
         ListNode node2 = Solution0002.parseListNode("5,6,4");
        ListNode result = solution0002.addTwoNumbers(node1,node2);
        var array = ListNode.listNodeToArray(result);

        assertArrayEquals(new int[]{7,0,8}, array );
    }

    @Test
    void addTwoNumbersTest2() {
        ListNode node1 = ListNode.arrayListToListNode(List.of(0));
        ListNode node2 = ListNode.arrayListToListNode(List.of(0));
        ListNode result = solution0002.addTwoNumbers(node1,node2);
        var array = ListNode.listNodeToArray(result);

        assertArrayEquals(new int[]{0}, array );
    }

    @Test
    void addTwoNumbersTest3() {
        ListNode node1 = ListNode.arrayListToListNode(List.of(9));
        ListNode node2 = ListNode.arrayListToListNode(List.of(1,9,9,9,9,9,9,9,9,9));
        ListNode result = solution0002.addTwoNumbers(node1,node2);
        var array = ListNode.listNodeToArray(result);

        assertArrayEquals(new int[]{0,0,0,0,0,0,0,0,0,0,1}, array );
    }

    @Test
    void addTwoNumbersTest4() {
        ListNode node1 = ListNode.arrayListToListNode(Arrays.asList(1,1,1,1,1,1,1,1,1,1,1));
        ListNode node2 = ListNode.arrayListToListNode(Arrays.asList(1,1,1,1,1,1,1,1,1,1,1));
        ListNode result = solution0002.addTwoNumbers(node1,node2);
        var array = ListNode.listNodeToArray(result);

        assertArrayEquals(new int[]{2,2,2,2,2,2,2,2,2,2,2}, array );
    }

    @Test
    void addTwoNumbersTest5() {
        ListNode node1 = Solution0002.parseListNode("1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1");
        ListNode node2 = Solution0002.parseListNode("5,6,4");
        ListNode result = solution0002.addTwoNumbers(node1,node2);
        var array = ListNode.listNodeToArray(result);

        assertArrayEquals(new int[]{6,6,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1}, array );
    }
}