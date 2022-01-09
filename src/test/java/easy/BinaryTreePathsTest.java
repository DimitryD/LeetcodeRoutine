package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePathsTest {
    BinaryTreePaths binaryTreePaths = new BinaryTreePaths();

    @Test
    void test1() {
        TreeNode root = new TreeNode(new Integer[]{1,2,3});
        assertTrue(binaryTreePaths.binaryTreePaths(root).contains("1->2"));
        assertTrue(binaryTreePaths.binaryTreePaths(root).contains("1->3"));
    }

}