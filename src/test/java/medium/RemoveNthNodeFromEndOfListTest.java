package medium;

import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {
    RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();

    @Test
    void test1() {
        ListNode listNode = new ListNode(1);
        assertNull(removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 1));
    }

    @Test
    void test2() {
        ListNode listNode = new ListNode(1, new ListNode());
        assertEquals(listNode, removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 1));
    }

}