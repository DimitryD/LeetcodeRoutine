package medium;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

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
