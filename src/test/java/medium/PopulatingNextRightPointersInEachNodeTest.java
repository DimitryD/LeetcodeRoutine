package medium;

import common.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PopulatingNextRightPointersInEachNodeTest {
    PopulatingNextRightPointersInEachNode populatingNextRightPointersInEachNode = new PopulatingNextRightPointersInEachNode();

    @Test
    void test1() {
        Node root = new Node(1, new Node(2), new Node(3), null);
        assertEquals(3, populatingNextRightPointersInEachNode.connect(root).left.next.val);
    }

    @Test
    void test2() {
        Node root = new Node(1, new Node(2), new Node(3), null);
        assertEquals(3, populatingNextRightPointersInEachNode.connectRecursive(root).left.next.val);
    }

}