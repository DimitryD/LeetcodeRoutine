package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDepthBinaryTreeTest {
    MinimumDepthBinaryTree minimumDepthBinaryTree = new MinimumDepthBinaryTree();

    @Test
    void test1() {
        TreeNode root = new TreeNode(new Integer[]{3,9,20,null,null,15,7});
        assertEquals(2, minimumDepthBinaryTree.minDepth(root));
    }

    @Test
    void test2() {
        TreeNode root = TreeNode.deserialize("2,null,3,null,4,null,5,null,6");
        assertEquals(5, minimumDepthBinaryTree.minDepth(root));
    }

}