package easy;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfRootToLeafBinaryNumbersTest {
    SumOfRootToLeafBinaryNumbers sumOfRootToLeafBinaryNumbers = new SumOfRootToLeafBinaryNumbers();

    @Test
    void test1() {
        TreeNode root = new TreeNode(new Integer[]{1,0,1,0,1,0,1});
        assertEquals(22, sumOfRootToLeafBinaryNumbers.sumRootToLeaf(root));
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(new Integer[]{0});
        assertEquals(0, sumOfRootToLeafBinaryNumbers.sumRootToLeaf(root));
    }

}