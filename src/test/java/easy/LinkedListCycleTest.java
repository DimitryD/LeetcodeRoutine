package easy;

import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {
    LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    void test1() {
        ListNode listNode = new ListNode(1);
        ListNode cycle = new ListNode(-1, listNode);
        listNode.next = new ListNode(2, cycle);
        assertTrue(linkedListCycle.hasCycle(listNode));
    }

    @Test
    void test2() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(-1, listNode);
        assertTrue(linkedListCycle.hasCycle(listNode));
    }

    @Test
    void test3() {
        ListNode listNode = new ListNode(1);
        assertFalse(linkedListCycle.hasCycle(listNode));
    }

    @Test
    void test4() {
        ListNode listNode = new ListNode(1, new ListNode(2));
        assertFalse(linkedListCycle.hasCycle(listNode));
    }

    @Test
    void test5() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        assertFalse(linkedListCycle.hasCycle(listNode));
    }

}