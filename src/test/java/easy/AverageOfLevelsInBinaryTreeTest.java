package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfLevelsInBinaryTreeTest {
    AverageOfLevelsInBinaryTree averageOfLevelsInBinaryTree = new AverageOfLevelsInBinaryTree();


    @Test
    void test1() {
        TreeNode root = new TreeNode(new Integer[]{3,9,20,null,null,15,7,2147483647, 21474836, 2147483642});
        assertEquals(3, averageOfLevelsInBinaryTree.averageOfLevels(root).get(0));
    }

}