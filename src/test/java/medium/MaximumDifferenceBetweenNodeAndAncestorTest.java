package medium;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDifferenceBetweenNodeAndAncestorTest {
    MaximumDifferenceBetweenNodeAndAncestor maximumDifferenceBetweenNodeAndAncestor = new MaximumDifferenceBetweenNodeAndAncestor();

    @Test
    void test1() {
        TreeNode root = new TreeNode(new Integer[] {8,3,10,1,6,null,14,null,null,14,7,13});
        assertEquals(11, maximumDifferenceBetweenNodeAndAncestor.maxAncestorDiff(root));
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(new Integer[] {8,3,10,1,6,null,14,null,null,4,7,13});
        assertEquals(7, maximumDifferenceBetweenNodeAndAncestor.maxAncestorDiff(root));
    }

    @Test
    void test3() {
        TreeNode root = new TreeNode(new Integer[] {1,2,500});
        assertEquals(499, maximumDifferenceBetweenNodeAndAncestor.maxAncestorDiff(root));
    }

}