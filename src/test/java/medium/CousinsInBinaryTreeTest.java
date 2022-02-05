package medium;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CousinsInBinaryTreeTest {
    CousinsInBinaryTree cousinsInBinaryTree = new CousinsInBinaryTree();

    @Test
    void test1() {
        TreeNode root = new TreeNode(new Integer[]{1,2,3,null,4,null,5});
        assertTrue(cousinsInBinaryTree.isCousins(root, 4, 5));
    }

}