package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeafSimilarTreesTest {
    LeafSimilarTrees  leafSimilarTrees = new LeafSimilarTrees();

    @Test
    void test1() {
        TreeNode root1 = new TreeNode(new Integer[]{1,2,3});
        TreeNode root2 = new TreeNode(new Integer[]{1,2,3});
        assertTrue(leafSimilarTrees.leafSimilar(root1, root2));
    }

    @Test
    void test2() {
        TreeNode root1 = new TreeNode(new Integer[]{1,3,2});
        TreeNode root2 = new TreeNode(new Integer[]{1,2,3});
        assertFalse(leafSimilarTrees.leafSimilar(root1, root2));
    }

}