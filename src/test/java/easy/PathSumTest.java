package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {
    PathSum pathSum = new PathSum();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null);
        assertTrue(pathSum.hasPathSum(root, 6));
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), null);
        assertTrue(pathSum.hasPathSum(root, 3));
    }

}