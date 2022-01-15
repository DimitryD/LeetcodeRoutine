package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {
    SameTree sameTree = new SameTree();

    @Test
    void test1() {
        TreeNode p = new TreeNode(new Integer[]{1,2,3});
        TreeNode q = new TreeNode(new Integer[]{1,2,3});
        assertTrue(sameTree.isSameTree(p, q));
    }

    @Test
    void test2() {
        TreeNode p = new TreeNode(new Integer[]{1,2});
        TreeNode q = new TreeNode(new Integer[]{1,null,2});
        assertFalse(sameTree.isSameTree(p, q));
    }
    @Test
    void test3() {
        TreeNode p = new TreeNode(new Integer[]{1,2,1});
        TreeNode q = new TreeNode(new Integer[]{1,1,2});
        assertFalse(sameTree.isSameTree(p, q));
    }

}