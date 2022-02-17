package medium;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorOfDeepestLeavesTest {
    LowestCommonAncestorOfDeepestLeaves lowestCommonAncestorOfDeepestLeaves = new LowestCommonAncestorOfDeepestLeaves();


    @Test
    void test1() {
        TreeNode treeNode = TreeNode.deserialize("0,1,3,null,2,null,null");
        assertEquals(2, lowestCommonAncestorOfDeepestLeaves.lcaDeepestLeaves(treeNode).val);
    }

    @Test
    void test2() {
        TreeNode treeNode = TreeNode.deserialize("3,5,1,6,2,0,8");
        assertEquals(3, lowestCommonAncestorOfDeepestLeaves.lcaDeepestLeaves(treeNode).val);
    }

    @Test
    void test3() {
        TreeNode treeNode = TreeNode.deserialize("1");
        assertEquals(1, lowestCommonAncestorOfDeepestLeaves.lcaDeepestLeaves(treeNode).val);
    }

}