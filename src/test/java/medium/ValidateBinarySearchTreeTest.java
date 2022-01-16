package medium;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBinarySearchTreeTest {
    ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

    @Test
    void test1() {
        TreeNode root = new TreeNode(new Integer[]{1,0,3});
        assertTrue(validateBinarySearchTree.isValidBST(root));
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(new Integer[]{2,2,2});
        assertFalse(validateBinarySearchTree.isValidBST(root));
    }

}