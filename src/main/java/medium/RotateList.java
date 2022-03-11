package medium;

import common.ListNode;

public class RotateList {
    // https://leetcode.com/problems/rotate-list/
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        int size = 1;
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            size++;
        }
        int nodesToMove = k % size;
        if (nodesToMove == 0)
            return head;
        current = head;
        for (int i = 0; i < size - nodesToMove - 1; i++)
            current = current.next;
        ListNode newHead = current.next;
        current.next = null;
        current = newHead;
        while (current.next != null)
            current = current.next;

        current.next = head;
        return newHead;
    }
}
