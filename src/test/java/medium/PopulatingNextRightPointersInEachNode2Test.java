package medium;

import common.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PopulatingNextRightPointersInEachNode2Test {
    PopulatingNextRightPointersInEachNode2 nextRightPointersInEachNode2 = new PopulatingNextRightPointersInEachNode2();

    @Test
    void test1() {
        Node root = new Node(1, new Node(2), new Node(3), null);
        assertEquals(3, nextRightPointersInEachNode2.connect(root).left.next.val);
    }

}