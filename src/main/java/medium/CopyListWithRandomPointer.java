package medium;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {
    // https://leetcode.com/problems/copy-list-with-random-pointer/
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> dictionary = new HashMap<>();
        Node dummyNode = new Node(0);
        Node currentOriginal = head;
        Node currentCopied = dummyNode;
        while (currentOriginal != null) {
            currentCopied.next = new Node(currentOriginal.val);
            currentCopied = currentCopied.next;
            dictionary.put(currentOriginal, currentCopied);
            currentOriginal = currentOriginal.next;

        }
        currentOriginal = head;
        currentCopied = dummyNode.next;
        while (currentOriginal != null) {
            currentCopied.random = dictionary.get(currentOriginal.random);
            currentCopied = currentCopied.next;
            currentOriginal = currentOriginal.next;
        }

        return dummyNode.next;
    }

    public Node copyRandomListWithOutAdditionalMemory(Node head) {
        Node current = head;
        while (current != null) {
            Node copy = new Node(current.val);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }
        current = head;
        while (current != null) {
            Node copy = current.next;
            if (current.random == null) copy.random = null;
            else copy.random = current.random.next;
            current = copy.next;
        }
        Node dummyHead = new Node(0);
        Node copyCurrent = dummyHead;
        current = head;
        while (current != null) {
            copyCurrent.next = current.next;
            copyCurrent = copyCurrent.next;
            current.next = current.next.next;
            current = current.next;
        }
        return dummyHead.next;
    }

}
