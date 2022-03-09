package medium;

import common.ListNode;

public class RemoveDuplicatesFromSortedListII {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode result = null, current = null;
        int value = -101;
        ListNode slow = head, fast = head.next;
        while (slow != null && fast != null) {
            if (slow.val != fast.val && slow.val != value) {
                if (result == null) {
                    result = new ListNode(slow.val);
                    current = result;
                } else{
                    current.next = new ListNode(slow.val);
                    current = current.next;
                }
            } else {
                value = slow.val;
            }
            slow = slow.next;
            fast = fast.next;
        }
        if (slow != null && slow.val != value)
            if (current != null)
                current.next = new ListNode(slow.val);
            else
                result = new ListNode(slow.val);
        return result;
    }
}
