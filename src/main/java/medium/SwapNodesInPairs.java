package medium;

import common.ListNode;

public class SwapNodesInPairs {
    // https://leetcode.com/problems/swap-nodes-in-pairs/
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode first = head;
        ListNode second = first.next;
        head = second;
        ListNode temp = second.next;
        second.next = first;
        first.next = swapPairs(temp);
        return head;
    }
}
