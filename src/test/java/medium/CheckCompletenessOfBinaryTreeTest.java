package medium;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckCompletenessOfBinaryTreeTest {

    CheckCompletenessOfBinaryTree checkCompletenessOfBinaryTree = new CheckCompletenessOfBinaryTree();

    @Test
    void test1() {
        TreeNode root = TreeNode.deserialize("1,2,3,4,5,6,null");
        assertTrue(checkCompletenessOfBinaryTree.isCompleteTree(root));
    }

    @Test
    void test2() {
        TreeNode root = TreeNode.deserialize("1,2,3,4,5,null,7");
        assertFalse(checkCompletenessOfBinaryTree.isCompleteTree(root));
    }
}