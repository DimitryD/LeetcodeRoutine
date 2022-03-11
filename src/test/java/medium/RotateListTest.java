package medium;

import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateListTest {
    RotateList rotateList = new RotateList();

    @Test
    void test1() {
        ListNode head = new ListNode(0);
        ListNode newHead = new ListNode(2);
        head.next = new ListNode(1, newHead);
        assertEquals(newHead, rotateList.rotateRight(head, 1));
    }

    @Test
    void test2() {
        ListNode head = new ListNode(0);
        ListNode newHead = new ListNode(2);
        head.next = new ListNode(1, newHead);
        assertEquals(newHead, rotateList.rotateRight(head, 4));
    }

}