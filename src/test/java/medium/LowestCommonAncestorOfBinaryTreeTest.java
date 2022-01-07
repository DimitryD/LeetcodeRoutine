package medium;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorOfBinaryTreeTest {
    LowestCommonAncestorOfBinaryTree lowestCommonAncestorOfBinaryTree = new LowestCommonAncestorOfBinaryTree();

    @Test
    void test1() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);
        TreeNode lca = new TreeNode(3, q, new TreeNode(3, null, p));
        TreeNode root = new TreeNode(3, lca, null);
        assertEquals(lca, lowestCommonAncestorOfBinaryTree.lowestCommonAncestor(root, p, q));
    }

}