package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindModeinBinarySearchTreeTest {
    FindModeinBinarySearchTree findModeinBinarySearchTree = new FindModeinBinarySearchTree();

    @Test
    void test1() {
        TreeNode root = new TreeNode(new Integer[]{1,null,2,null,null,2});
        assertArrayEquals(new int[]{2}, findModeinBinarySearchTree.findMode(root));
    }

}