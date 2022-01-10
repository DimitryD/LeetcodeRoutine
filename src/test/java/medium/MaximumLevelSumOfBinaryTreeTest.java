package medium;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumLevelSumOfBinaryTreeTest {
    MaximumLevelSumOfBinaryTree maximumLevelSumOfBinaryTree = new MaximumLevelSumOfBinaryTree();


    @Test
    void test1() {
        TreeNode root = new TreeNode(new Integer[]{1,7,0,7,-8,null,null});
        assertEquals(2, maximumLevelSumOfBinaryTree.maxLevelSum(root));
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(new Integer[]{89,null,10250,98693,-89388,null,null,null,-32127});
        assertEquals(2, maximumLevelSumOfBinaryTree.maxLevelSum(root));
    }

}