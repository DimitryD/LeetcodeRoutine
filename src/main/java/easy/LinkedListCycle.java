package easy;

import common.ListNode;

public class LinkedListCycle {
    // https://leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        if (fast == null)
            return false;
        fast = fast.next;
        while (fast != null) {
            if (slow == fast)
                return true;
            slow = slow.next;
            fast = fast.next;
            if (fast != null)
                fast = fast.next;
        }
        return false;
    }
}
