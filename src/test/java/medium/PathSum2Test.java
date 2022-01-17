package medium;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSum2Test {
    PathSum2 pathSum2 = new PathSum2();

    @Test
    void test1() {
        TreeNode root = new TreeNode(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,null,null, 5,1});
        assertEquals(2, pathSum2.pathSum(root, 22).size());
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(new Integer[]{1,2,3});
        assertEquals(1, pathSum2.pathSum(root, 3).size());
    }

}