package common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    @Test
    void test1() {
        ListNode listNode = new ListNode();
        assertNotNull(listNode);
    }

    @Test
    void test2() {
        ListNode listNode = new ListNode(3);
        assertEquals(3, listNode.val);
    }

    @Test
    void test3() {
        ListNode listNode = new ListNode(3, new ListNode());
        assertNotNull(listNode.next);
    }

}