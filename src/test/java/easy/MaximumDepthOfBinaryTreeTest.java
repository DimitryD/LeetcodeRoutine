package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {
    MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null);
        assertEquals(3, maximumDepthOfBinaryTree.maxDepth(root));
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3));
        assertEquals(2, maximumDepthOfBinaryTree.maxDepth(root));
    }

}