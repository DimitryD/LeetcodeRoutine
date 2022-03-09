package medium;

import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListIITest {

    RemoveDuplicatesFromSortedListII removeDuplicatesFromSortedListII = new RemoveDuplicatesFromSortedListII();

    @Test
    void test1() {
        ListNode listNode7 = new ListNode(5);
        ListNode listNode6 = new ListNode(4, listNode7);
        ListNode listNode5 = new ListNode(4, listNode6);
        ListNode listNode4 = new ListNode(3, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        ListNode result = removeDuplicatesFromSortedListII.deleteDuplicates(listNode1);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(5, result.next.next.val);
    }

}