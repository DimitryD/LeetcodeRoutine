package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {
    SymmetricTree symmetricTree = new SymmetricTree();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null);
        assertFalse(symmetricTree.isSymmetric(root));
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    void test3() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), new TreeNode(2, null, new TreeNode(3)));
        assertTrue(symmetricTree.isSymmetric(root));
    }


}