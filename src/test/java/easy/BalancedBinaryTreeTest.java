package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {
    BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

    @Test
    void test1() {
        TreeNode root = TreeNode.deserialize("1,2,2,3,null,null,3,4,null,null,4");
        assertFalse(balancedBinaryTree.isBalanced(root));
    }

    @Test
    void test2() {
        assertTrue(balancedBinaryTree.isBalanced(null));
    }

    @Test
    void test3() {
        TreeNode root = TreeNode.deserialize("3,9,20,null,null,15,7");
        assertTrue(balancedBinaryTree.isBalanced(root));
    }

}