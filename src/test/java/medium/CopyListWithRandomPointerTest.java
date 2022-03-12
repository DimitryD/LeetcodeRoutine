package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyListWithRandomPointerTest {
    CopyListWithRandomPointer copyListWithRandomPointer = new CopyListWithRandomPointer();

    @Test
    void test1() {
        Node node1 = new Node(3);
        Node node2 = new Node(3);
        Node node3 = new Node(3);
        node1.random = null;
        node1.next = node2;
        node2.random = node1;
        node2.next = node3;
        node3.random = null;
        Node copiedList = copyListWithRandomPointer.copyRandomList(node1);
        assertNull(copiedList.random);
        assertEquals(3, copiedList.next.random.val);
        assertNull(copiedList.next.next.random);

    }
    @Test
    void test2() {
        Node node1 = new Node(3);
        Node node2 = new Node(3);
        Node node3 = new Node(3);
        node1.random = null;
        node1.next = node2;
        node2.random = node1;
        node2.next = node3;
        node3.random = null;
        Node copiedList = copyListWithRandomPointer.copyRandomListWithOutAdditionalMemory(node1);
        assertNull(copiedList.random);
        assertEquals(3, copiedList.next.random.val);
        assertNull(copiedList.next.next.random);

    }

}