package medium;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePruningTest {
    BinaryTreePruning binaryTreePruning = new BinaryTreePruning();

    @Test
    void test1() {
        TreeNode root = TreeNode.deserialize("0");
        assertNull(binaryTreePruning.pruneTree(root));
    }

    @Test
    void test2() {
        TreeNode root = TreeNode.deserialize("1");
        assertNotNull(binaryTreePruning.pruneTree(root));
    }

    @Test
    void test3() {
        TreeNode root = TreeNode.deserialize("0,0,1");
        assertNotNull(binaryTreePruning.pruneTree(root));
    }

}