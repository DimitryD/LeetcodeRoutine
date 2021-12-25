package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInorderTraversalTest {
    BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null);
        assertEquals(3, binaryTreeInorderTraversal.inorderTraversal(root).get(0));
    }

}