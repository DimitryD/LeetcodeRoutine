package medium;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalTest {
    BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), null);
        List<List<Integer>> tree = binaryTreeLevelOrderTraversal.levelOrder(root);
        assertEquals(1, tree.get(0).get(0));
    }

    @Test
    void test2() {
        TreeNode root = null;
        List<List<Integer>> tree = binaryTreeLevelOrderTraversal.levelOrder(root);
        assertTrue(tree.isEmpty());
    }

}