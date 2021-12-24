package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePostorderTraversalTest {
    BinaryTreePostorderTraversal binaryTreePostorderTraversal = new BinaryTreePostorderTraversal();


    @Test
    void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null);
        assertEquals(3, binaryTreePostorderTraversal.postorderTraversal(root).get(0));
        assertEquals(1, binaryTreePostorderTraversal.postorderTraversal(root).get(2));
    }

}