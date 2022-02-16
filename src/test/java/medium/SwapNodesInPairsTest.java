package medium;

import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {

    SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();

    @Test
    void test1() {
        assertNull(swapNodesInPairs.swapPairs(null));
    }

    @Test
    void test2() {
        ListNode listNode = new ListNode(1);
        assertEquals(1, swapNodesInPairs.swapPairs(listNode).val);
    }

    @Test
    void test3() {
        ListNode listNode = new ListNode(1, new ListNode(2));
        assertEquals(2, swapNodesInPairs.swapPairs(listNode).val);
    }

}