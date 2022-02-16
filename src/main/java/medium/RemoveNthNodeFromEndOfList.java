package medium;


import common.ListNode;

public class RemoveNthNodeFromEndOfList {
    // https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode slow = head, fast = head;
        int passed = 0;
        while (fast != null) {
            fast = fast.next;
            if (passed > n)
                slow = slow.next;
            passed++;
        }
        if (slow == head && passed == n)
            head = head.next;
        else
            slow.next = slow.next.next;
        return head;
    }
}
